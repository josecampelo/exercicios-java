package exercicios.arrays;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder numerosRegulares = new StringBuilder("[");
        StringBuilder numerosInversos = new StringBuilder("[");
        int[] numeros = new int[5];
        int[] ordemInversa = new int[5];
        int contador = numeros.length - 1;
        int entrada;

        System.out.println("Digite " + numeros.length + " números para o Array");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            entrada = scanner.nextInt();
            numeros[i] = entrada;
            ordemInversa[contador] = numeros[i];
            contador--;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                numerosRegulares.append(numeros[i]).append("]");
                numerosInversos.append(ordemInversa[i]).append("]");
            } else {
                numerosRegulares.append(numeros[i]).append(", ");
                numerosInversos.append(ordemInversa[i]).append(", ");
            }
        }

        System.out.println("Ordem natural dos números fornecidos: " + numerosRegulares);
        System.out.println("Ordem inversa dos números fornecidos: " + numerosInversos);
    }
}