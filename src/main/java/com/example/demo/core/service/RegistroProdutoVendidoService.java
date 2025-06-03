package com.example.demo.core.service;

import com.example.demo.core.domain.entities.Estoque;
import com.example.demo.core.domain.entities.Funcionario;
import com.example.demo.core.domain.entities.Produto;
import com.example.demo.core.domain.entities.RegistroProdutos;
import com.example.demo.core.domain.usecase.RegistroProdutosUseCase;
import com.example.demo.exceptions.EstoqueAcabandoException;
import com.example.demo.exceptions.EstoqueNotFoundException;
import com.example.demo.exceptions.FuncionarioNotFoundException;
import com.example.demo.exceptions.ProdutoNotFoundException;
import com.example.demo.infra.port.EstoqueRepository;
import com.example.demo.infra.port.FuncionarioRepository;
import com.example.demo.infra.port.ProdutoRepository;
import com.example.demo.infra.port.RegistroProdutoRepository;
import com.example.demo.presenters.Dtos.MostrarProdutos;
import com.example.demo.presenters.Dtos.MostrarProdutosVendidos;
import com.example.demo.presenters.Dtos.RegistrarProdutosDto;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegistroProdutoVendidoService implements RegistroProdutosUseCase {

    @Autowired
    RegistroProdutoRepository registroProdutoRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    EstoqueRepository estoqueRepository;

    @Autowired
    EntityManager entityManager;

    public void registroProdutosComprados(RegistrarProdutosDto registrarProdutosDto) {
        String codigoEan_13 = registrarProdutosDto.codigoEAN_13();
        String nome = registrarProdutosDto.nome_funcionario();

        Produto produto = produtoRepository.findByCodigoEAN13(codigoEan_13);

        if(produto == null){
            throw new ProdutoNotFoundException("Não foi possível encontrar o produto");
        } else {

            Funcionario funcionario = funcionarioRepository.findByNome(nome);

            if(funcionario == null){
                throw new FuncionarioNotFoundException("Não foi possível encontrar o funcionário");
            } else {
                //salvar ambos em RegistroProdutos

                RegistroProdutos registroProdutos = new RegistroProdutos();
                registroProdutos.setProduto(produto);
                registroProdutos.setFuncionario(funcionario);
                registroProdutos.setQtdVendida(Integer.parseInt(registrarProdutosDto.qtdVendida()));

                registroProdutos.setCreated_at(LocalDateTime.now());
                registroProdutos.setUpdate_at(LocalDateTime.now());

                String status = atualizandoQtdAtual(produto, Integer.parseInt(registrarProdutosDto.qtdVendida()));

                if(status.equals("inválido")){
                    throw new EstoqueNotFoundException("Número de vendas inválidos: Tem mais do que a qtdAtual");
                }else {
                    if(status.equals("false")) {
                        throw new EstoqueAcabandoException("Precisa repor o produto " + produto.getNome() + " de codigo " + codigoEan_13);
                    }

                    registroProdutoRepository.save(registroProdutos);
                }

            }
        }
    }

    public List<MostrarProdutosVendidos> buscandoProdutosVendidos() {
        String sql = "SELECT p.nome_do_produto, f.nome, e.qtd_atual, rp.qtd_vendida, p.codigoean_13, rp.created_at " +
                "FROM tb_produto p\n" +
                "JOIN tb_estoque e ON e.produto = p.id\n" +
                "JOIN tb_registroprodutos rp ON rp.produto = p.id\n" +
                "JOIN tb_funcionario f ON f.id = rp.funcionario\n" +
                "ORDER BY rp.created_at DESC;";

        List<MostrarProdutosVendidos> produtos = entityManager.createNativeQuery(sql, MostrarProdutosVendidos.class)
                .getResultList();

        for(MostrarProdutosVendidos p: produtos){
            System.out.println("Nome: " + p.getNome_do_produto());
            System.out.println("Codigo: " + p.getCodigoEAN_13());
            System.out.println("Funcionario: " + p.getNome_do_funcionario());
            System.out.println("qtdVendida: " + p.getQtdVendida() + "");
            System.out.println("qtdAtual: " + p.getQtdAtual() + "");
        }

        return produtos;
    }

    public String atualizandoQtdAtual(Produto produto, Integer qtdVendida){
        Estoque estoque = estoqueRepository.findByProduto(produto);

        Integer qtdAtual = estoque.getQtdAtual();
        Integer qtdAtualNova = qtdAtual - qtdVendida;

        if(qtdAtualNova < 0){
            return "inválido";
        }else {
            estoque.setQtdAtual(qtdAtualNova);
            estoqueRepository.save(estoque);

            if (estoque.getQtdAtual() > estoque.getQtdMin()) {
                return "true";
            } else {
                return "false";
            }
        }
    }

}
