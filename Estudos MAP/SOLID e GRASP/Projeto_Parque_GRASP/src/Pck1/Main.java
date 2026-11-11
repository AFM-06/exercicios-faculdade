package Pck1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Parque parque = new Parque("Parque Diversao");

        int opcao;

        do {
            System.out.println("===== PARQUE DIVERSAO =====");
            System.out.println("1 - Vender ingresso");
            System.out.println("2 - Listar ingressos vendidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {

                System.out.print("Nome do cliente: ");
                String nome = leitor.nextLine();

                System.out.print("Idade do cliente: ");
                int idade = leitor.nextInt();
                leitor.nextLine();

                System.out.println();
                System.out.println("Tipos de ingresso:");
                System.out.println("1 - BASICO - R$ 50,00");
                System.out.println("2 - COMPLETO - R$ 80,00");
                System.out.print("Escolha o tipo: ");

                int opcaoTipo = leitor.nextInt();
                leitor.nextLine();

                String tipo;

                if (opcaoTipo == 1) {
                    tipo = "BASICO";
                } else {
                    tipo = "COMPLETO";
                }

                Cliente cliente = new Cliente(nome, idade);

                double valor = parque.calcularPreco(cliente, tipo);

                Ingresso ingresso =
                    new Ingresso(cliente, tipo, valor);

                parque.getIngressos().add(ingresso);

                parque.imprimirRecibo(ingresso);

            } else if (opcao == 2) {

                parque.listarIngressos();

            } else if (opcao != 0) {

                System.out.println("Opcao invalida.");
                System.out.println();
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        leitor.close();
    }
}
