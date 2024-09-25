package com.senai.java.fintech;

public abstract class relatorioFinanceiro {
    protected conta conta;

    public relatorioFinanceiro(conta conta) {
        this.conta = conta;
    }

    public abstract void gerarRelatorio();
}