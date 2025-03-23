package exercicios.arrays;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder("[");
        double[] notas = new double[4];
        double media = 0;

        System.out.println("Digite " + notas.length + " notas para calcular a média das notas do aluno");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota: ");
            notas[i] = scanner.nextDouble();
            media +=  notas[i];
        }

        media = media / notas.length;

        System.out.println("Média do aluno: " + String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}