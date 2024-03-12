package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número N.
 *
 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
 *
 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossível".
 *
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioForDivisao {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número que deseja dividir pelos próximos: ");
        float dividendo = s.nextInt();
        System.out.print("Digite a quantidade de números deseja testar a divisão: ");
        int qtd = s.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o número que deseja ser o divisor do número %.0f: ", dividendo);
            float divisor = s.nextInt();
            float divisao = dividendo / divisor;
            if (divisao <= 0) {
                System.out.println("Dívisão impossível");
            } else {
                System.out.printf("Resultado da divisão: %.2f\n", divisao);
            }
        }
        /*FORA:
        switch ((int) dividendo) {
        case 1 -> {
        switch ((int) dividendo) {
        case 2 -> {
        break FORA;
        }
        default -> throw new AssertionError();
        }
        }
        default ->
        throw new AssertionError();
        }*/
        /*OUTER:
        while (true) {
        System.out.println("1 - Digitar um número para realizar a divisão pelo número " + dividendo);
        System.out.println("2 - Sair do programa");
        System.out.print("Qual opção você deseja: ");
        int opcao = s.nextInt();
        switch (opcao) {
        case 1 -> {
        System.out.print("Digite o número que deseja ser o dividendo do número " + dividendo + ": ");
        int divisor = s.nextInt();
        float divisao = dividendo / divisor;
        if (divisao <= 0) {
        System.out.println("Dívisão impossível");
        } else {
        System.out.println("Resultado da divisão: " + divisao);
        }
        }
        case 2 -> {
        System.out.println("Obrigado por usar o programa!");
        break OUTER;
        }
        default ->
        System.out.println("Opção inválida, tente novamente!");
        }
        }*/
    }
    /*
    if (opcao == 1) {
                System.out.print("Digite o número que deseja ser o dividendo do número " + divisor + ": ");
                int dividendo = s.nextInt();
                int divisao = divisor / dividendo;
                if (divisao == 0) {
                    System.out.println("Dívisão impossível");
                } else {
                    System.out.println("Resultado da divisão: " + divisao);
                }
            } else if (opcao == 2) {
                System.out.println("Obrigado por usar o programa!");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
     */
}
