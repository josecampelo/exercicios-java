package exercicios.arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] numeros = {7, 34, 13, 58, 65, 96, 33, 24, 2, 85};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(soma + " + " + numeros[i]);
            soma += numeros[i];
            System.out.println(" = " + soma);
        }

        System.out.println("A soma de todos os elementos do array de números é: " + soma);
    }
}