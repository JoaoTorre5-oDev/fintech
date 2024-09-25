package com.senai.java.fintech;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<conta> contas = new ArrayList<>();

        //Criar contas
        contaCorrente contaCorrente = new contaCorrente("João Torres", "12345-6", 500);
        contaPoupanca contaPoupanca = new contaPoupanca("Marilia jonhson", "65432-1", 0.5);

        while (true) {
            System.out.println("\n --- Menu de Operações --- ");
            System.out.println("1. Depositar (Conta Corrente)");
            System.out.println("2. Sacar (Conta Corrente)");
            System.out.println("3. Consultar Saldo (Conta Corrente)");
            System.out.println("4. Depositar (Conta Poupança)");
            System.out.println("5. Sacar (Conta Poupança)");
            System.out.println("6. Consultar Saldo (Conta Poupança)");
            System.out.println("7. Aplicar Rendimento (Conta Poupança)");
            System.out.println("8. Gerar Relatório (Conta Corrente)");
            System.out.println("9. Gerar Relatório (Conta Poupança)");
            System.out.println("10. Criar Conta Corrente");
            System.out.println("11. Criar Conta Poupança");
            System.out.println("12. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDepositoCC = scanner.nextDouble();
                    contaCorrente.realizarDeposito(valorDepositoCC);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaqueCC = scanner.nextDouble();
                    contaCorrente.realizarSaque(valorSaqueCC);
                    break;

                case 3:
                    System.out.println("Saldo Conta Corrente: R$ " + contaCorrente.getSaldo());
                    break;

                case 4:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDepositoCP = scanner.nextDouble();
                    contaPoupanca.realizarDeposito(valorDepositoCP);
                    break;

                case 5:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaqueCP = scanner.nextDouble();
                    contaPoupanca.realizarSaque(valorSaqueCP);
                    break;

                case 6:
                    System.out.println("Saldo Conta Poupança: R$ " + contaPoupanca.getSaldo());
                    break;

                case 7:
                    contaPoupanca.aplicarRendimento();
                    System.out.println("Rendimento aplicado com sucesso!");
                    break;

                case 8:
                    relatorioFinanceiro relatorioCC = new relatorioContaCorrente(contaCorrente);
                    relatorioCC.gerarRelatorio();
                    break;

                case 9:
                    relatorioFinanceiro relatorioCP = new relatorioContaPoupanca(contaPoupanca);
                    relatorioCP.gerarRelatorio();
                    break;

                case 10:
                    System.out.print("Digite o titular: ");
                    String titularCC = scanner.next();
                    System.out.print("Digite o número da conta: ");
                    String numeroCC = scanner.next();
                    System.out.print("Digite o limite do cheque especial: ");
                    double limite = scanner.nextDouble();
                    contas.add(new contaCorrente(titularCC, numeroCC, limite));
                    System.out.println("Conta Corrente criada com sucesso!");
                    break;

                case 11:
                    System.out.print("Digite o titular: ");
                    String titularCP = scanner.next();
                    System.out.print("Digite o número da conta: ");
                    String numeroCP = scanner.next();
                    System.out.print("Digite a taxa de rendimento: ");
                    double taxa = scanner.nextDouble();
                    contas.add(new contaPoupanca(titularCP, numeroCP, taxa));
                    System.out.println("Conta Poupança criada com sucesso!");
                    break;

                case 12:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

