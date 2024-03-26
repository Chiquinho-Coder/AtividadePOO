
package ado2;

import java.util.ArrayList;
import java.util.Scanner;

public class ADO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Cadastrar nova conta");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
              
            switch (opcao) {
                case 1:
                    System.out.print("Digite o numero da conta: ");
                    int numero = scanner.nextInt();
                    System.out.print("Digite o saldo inicial da conta: ");
                    double saldo = scanner.nextDouble();
                    System.out.print("Digite o limite da conta: ");
                    double limite = scanner.nextDouble();
                    System.out.print("Digite o nome do titular da conta: ");
                    String nome = scanner.next();
                    contas.add(new Conta(numero, saldo, limite, nome));
                    break;
                case 2:
                    System.out.print("Digite o numero da conta: ");
                    int numContaSacar = scanner.nextInt();
                    System.out.print("Digite o valor a sacar: ");
                    double valorSacar = scanner.nextDouble();
                    for (Conta conta : contas) {
                        if (conta.sacar(valorSacar)) {
                            System.out.println("\nSaque realizado com sucesso.");
                            System.out.println(conta);
                        } else {
                            System.out.println("\nSaldo insuficiente, nao foi possível realizar o saque.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o numero da conta: ");
                    int numContaDepositar = scanner.nextInt();
                    System.out.print("Digite o valor a depositar: ");
                    double valorDepositar = scanner.nextDouble();
                    for (Conta conta : contas) {
                        if (conta.depositar(valorDepositar)) {
                            
                            System.out.println("\nDeposito realizado com sucesso.");
                            System.out.println(conta);
                        } else {
                            System.out.println("\nLimite excedido: Nao foi possivel realizar o deposito ");}
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("\nOpcao invalida.");
            }
        }

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}

