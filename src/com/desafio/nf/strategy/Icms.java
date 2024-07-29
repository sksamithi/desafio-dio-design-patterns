package com.desafio.nf.strategy;

public class Icms implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        return valor * 0.18;
    }
}