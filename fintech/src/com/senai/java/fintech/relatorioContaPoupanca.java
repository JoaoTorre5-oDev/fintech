package com.senai.java.fintech;

/*
    Crie uma classe abstrata RelatorioFinanceiro com um metodo abstrato gerarRelatorio().
    Esse metodo será implementado nas subclasses RelatorioContaCorrente e RelatorioContaPoupanca,
    que gerarão relatórios detalhados para cada tipo de conta.
    Abstração: essa classe abstrata RelatorioFinanceiro édefinida para geração de relatórios,
    que é implementado nas classes concretas relatorioContaCorrente e relatorioContaPoupanca.
*/

public class relatorioContaPoupanca extends relatorioFinanceiro {

    public relatorioContaPoupanca(contaPoupanca conta) {
        super(conta);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório Conta Poupança");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNuConta());
        System.out.println("Saldo: " + conta.getSaldo());
        // Adicione lógica para histórico de transações se necessário
    }
}