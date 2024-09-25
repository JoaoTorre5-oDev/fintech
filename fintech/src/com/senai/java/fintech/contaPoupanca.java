package com.senai.java.fintech;

/*
    Herança: ContaCorrente e ContaPoupanca herdam da classe Conta,
    permitindo a reutilização de código e a definição de comportamentos comuns.
*/

public class contaPoupanca extends conta implements transacao {
    private double taxaRendimento;

    public contaPoupanca(String titular, String nuConta, double taxaRendimento) {
        super(titular, nuConta);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void realizarDeposito(double valor) {
        depositar(valor);
    }

    @Override
    public void realizarSaque(double valor) {
        sacar(valor);
    }

    @Override
    public void realizarTransferencia(conta contaDestino, double valor) {
        if (valor <= getSaldo()) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Transferência não permitida: saldo insuficiente.");
        }
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento / 100;
        depositar(rendimento);
    }
}