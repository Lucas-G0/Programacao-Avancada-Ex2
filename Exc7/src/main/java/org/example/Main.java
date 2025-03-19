package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ProdutoRepo list = new ProdutoRepo();

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Opção de cadastro selecionada.");
                    System.out.println("Informe o código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.println("Informe o nome do produto: ");
                    String nome = scanner.next();
                    System.out.println("Informe o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(codigo, nome, preco);
                    list.Add(produto);
                    System.out.println("\nProduto cadastrado com sucesso!\n\n\n\n");
                }
                case 2 -> {
                    System.out.println("Opção de busca selecionada.");
                    System.out.println("Informe o código do produto que está buscando: ");
                    int codigoBusca = scanner.nextInt();
                    Produto produtoBuscado = list.GetByCodigo(codigoBusca);
                    if (produtoBuscado == null) {
                        System.out.println("Produto não encontrado");
                    } else {
                        System.out.println("\n");
                        produtoBuscado.print();
                    }
                }
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
