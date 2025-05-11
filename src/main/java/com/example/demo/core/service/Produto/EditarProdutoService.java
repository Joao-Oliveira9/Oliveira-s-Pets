package com.example.demo.core.service.Produto;

import com.example.demo.core.domain.entities.Categoria;
import com.example.demo.core.domain.entities.Fornecedor;
import com.example.demo.core.domain.entities.Marca;
import com.example.demo.core.domain.entities.Produto;
import com.example.demo.core.domain.usecase.Produto.EditarProdutoUseCase;
import com.example.demo.infra.port.CategoriaRepository;
import com.example.demo.infra.port.FornecedorRepository;
import com.example.demo.infra.port.MarcaRepository;
import com.example.demo.infra.port.ProdutoRepository;
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

    public void editarProduto(ProdutoDto produtoDto) {
        Produto produto = produtoRepository.findByCodigoEAN13(produtoDto.codigoEAN_13());

        if(produto != null){
            String nome = produtoDto.nome_do_produto();
            String nome_categoria = produtoDto.nome_categoria();
            String preco = produtoDto.preco();
            String nome_fornecedor = produtoDto.nome_fornecedor();
            String nome_marca = produtoDto.nome_marca();

            if(!nome.isEmpty()) produto.setNome(nome);
            if(!preco.isEmpty()) produto.setPreco(preco);
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

            produtoRepository.save(produto);
        }else{
            //Produto nn encontrado
            System.out.println("Produto nn encontrado");
        }

    }
}
