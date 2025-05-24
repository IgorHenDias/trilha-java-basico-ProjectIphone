package com.igor.functionsphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone celular = new SmartPhone();
        int opcao;

        do {
            System.out.println("iPhone 2G \nAno: 2007");
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador Internet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    menuMusica(sc, celular);
                    break;
                case 2:
                    menuTelefone(sc, celular);
                    break;
                case 3:
                    menuNavegador(sc, celular);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void menuMusica(Scanner sc, SmartPhone celular) {
        int opcao;
        do {
            System.out.println("\n=== Reprodutor Musical ===");
            System.out.println("1. Selecionar música");
            System.out.println("2. Tocar música");
            System.out.println("3. Pausar música");
            System.out.println("0. Voltar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da música: ");
                    String musica = sc.nextLine();
                    celular.getReprodutor().selecionarMusica();
                    break;
                case 2:
                    celular.getReprodutor().tocarMusica();
                    break;
                case 3:
                    celular.getReprodutor().pausarMusica();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private static void menuTelefone(Scanner sc, SmartPhone celular) {
        int opcao;
        do {
            System.out.println("\n=== Aparelho Telefônico ===");
            System.out.println("1. Ligar");
            System.out.println("2. Atender");
            System.out.println("3. Correio de voz");
            System.out.println("0. Voltar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número de telefone: ");
                    String telefone = sc.nextLine();
                    celular.getTelefone().ligar();
                    break;
                case 2:
                    celular.getTelefone().atender();
                    break;
                case 3:
                    celular.getTelefone().CorreioVoz();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private static void menuNavegador(Scanner sc, SmartPhone celular) {
        int opcao;
        do {
            System.out.println("\n=== Navegador de main.java.main.java.com.igor.functionsphone.Internet ===");
            System.out.println("1. Exibir página");
            System.out.println("2. Adicionar nova aba");
            System.out.println("3. Atualizar página");
            System.out.println("0. Voltar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    celular.getNavegador().ExibirPagina();
                    break;
                case 2:
                    celular.getNavegador().adicionarNovaAba();
                    break;
                case 3:
                    celular.getNavegador().atualizarPagina();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
}
