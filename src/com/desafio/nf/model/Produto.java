package com.desafio.nf.model;

import com.desafio.nf.strategy.ImpostoStrategy;

public class Produto {
    private String nome;
    private double preco;
    private ImpostoStrategy impostoStrategy;

    public Produto(String nome, double preco, ImpostoStrategy impostoStrategy) {
        this.nome = nome;
        this.preco = preco;
        this.impostoStrategy = impostoStrategy;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ImpostoStrategy getImpostoStrategy() {
        return impostoStrategy;
    }

    public void setImpostoStrategy(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public double calcularImposto() {
        return impostoStrategy.calcular(preco);
    }

    @Override
    public String toString() {
        return String.format("Produto{nome='%s', preco=%.2f, imposto=%.2f}",
                nome, preco, calcularImposto());
    }
}
