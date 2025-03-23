package exercicios.arrays;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = {7, 14, 26, 37, 2, 80, 36, 41};
        int menorNumero = numeros[0];
        int maiorNumero = numeros[0];

        for (int numero: numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("Menor número do Array: " + menorNumero);
        System.out.println("Maior número do Array: " + maiorNumero);
    }
}