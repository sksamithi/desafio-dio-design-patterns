package com.desafio.nf.strategy;

public class Iss implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        return valor * 0.05;
    }
}