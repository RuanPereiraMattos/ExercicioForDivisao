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
    }

}
