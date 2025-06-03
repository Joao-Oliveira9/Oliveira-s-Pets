package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.entities.*;
import com.example.demo.core.domain.usecase.Produto.EditarProdutoUseCase;
import com.example.demo.exceptions.ProdutoNotFoundException;
import com.example.demo.infra.port.*;
import com.example.demo.presenters.Dtos.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditarProdutoService implements EditarProdutoUseCase {
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Autowired
    MarcaRepository marcaRepository;

    @Autowired
    EstoqueRepository estoqueRepository;

    public void editarProduto(ProdutoDto produtoDto) {
        Produto produto = produtoRepository.findByCodigoEAN13(produtoDto.codigoEAN_13());

        if(produto != null){
            String nome = produtoDto.nome_do_produto();
            String nome_categoria = produtoDto.nome_categoria();
            String preco = produtoDto.preco();
            String nome_fornecedor = produtoDto.nome_fornecedor();
            String nome_marca = produtoDto.nome_marca();
            String qtdMin = produtoDto.qtdMin();
            String qtdAtual = produtoDto.qtdAtual();

            if(!nome.isEmpty()) produto.setNome(nome);
            if(!preco.isEmpty()) produto.setPreco(Double.parseDouble(preco));
            if(!nome_categoria.isEmpty()) {
                Categoria categoria = categoriaRepository.findByNome(nome_categoria);
                produto.setCategoria(categoria);
            }
            if(!nome_fornecedor.isEmpty()) {
                Fornecedor fornecedor = fornecedorRepository.findByNome(nome_fornecedor);
                produto.setFornecedor(fornecedor);
            }
            if(!nome_marca.isEmpty()) {
                Marca marca = marcaRepository.findByNome(nome_marca);
                produto.setMarca(marca);
            }

            Estoque estoque = estoqueRepository.findByProduto(produto);

            if(estoque != null){
                if(!qtdMin.isEmpty()){
                    estoque.setQtdMin(Integer.parseInt(qtdMin));
                }
                if(!qtdAtual.isEmpty()){
                    estoque.setQtdAtual(Integer.parseInt(qtdAtual));
                }
            }

            produtoRepository.save(produto);

        }else{
            throw new ProdutoNotFoundException("Nao foi possível encontrar o produto");
        }

    }
}
