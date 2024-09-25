package com.senai.java.fintech;


public class conta {
    private String titular;
    private double saldo;
    private String nuConta;

    public conta(String titular, String nuConta) {
        this.titular = titular;
        this.nuConta = nuConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public String getNuConta() {
        return nuConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }
}
