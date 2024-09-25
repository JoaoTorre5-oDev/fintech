package com.senai.java.fintech;

/*
    Polimorfismo: A interface Transacao permite que cada tipo de conta implemente as operações de forma específica.
    Isso é visto nos métodos realizarDeposito, realizarSaque e realizarTransferencia.
*/
public interface transacao {
    void realizarDeposito(double valor);
    void realizarSaque(double valor);
    void realizarTransferencia(conta contaDestino, double valor);
}