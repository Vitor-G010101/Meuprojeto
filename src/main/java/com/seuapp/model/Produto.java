package com.seuapp.model;


public class Produto {
    public String nome;
    private Long id;
    public int quantidade;
    public double preco;

    public Produto(String s) {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preço) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, long id, int quantidade, double preço){
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;




    }
}
