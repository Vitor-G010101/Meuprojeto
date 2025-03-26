package com.seuapp.service;
import java.util.ArrayList;
import java.util.List;

import com.seuapp.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    public List<Produto> listartodos() {
        return new ArrayList<>();
    }
    public Produto salvar(Produto produto) {
        return produto;
    }

    public List<Produto> listarTodos() {

        return List.of();
    }
}
