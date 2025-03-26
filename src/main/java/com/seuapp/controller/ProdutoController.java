package com.seuapp.controller;


import com.seuapp.service.ProdutoService;
import com.seuapp.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private final ProdutoService produtoService;

    public ProdutoController (ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping(path = "list")
    public List<Produto> listarProduto() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
}
