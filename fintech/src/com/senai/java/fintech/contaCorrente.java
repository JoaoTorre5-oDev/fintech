package com.senai.java.fintech;

/*
    Herança: ContaCorrente e ContaPoupanca herdam da classe Conta,
    permitindo a reutilização de código e a definição de comportamentos comuns.
*/

public class contaCorrente extends conta implements transacao {
    private double limiteChequeEspecial;

    public contaCorrente(String titular, String nuConta, double limiteChequeEspecial) {
        super(titular, nuConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saque não permitido: saldo insuficiente.");
        }
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
        if (valor <= getSaldo() + limiteChequeEspecial) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Transferência não permitida: saldo insuficiente.");
        }
    }
}
