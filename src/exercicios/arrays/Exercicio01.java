package exercicios.arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] anosCopasVencidas = {1958, 1962, 1970, 1994, 2002};

        System.out.println(anosCopasVencidas.length);

        for(int i = 0; i < anosCopasVencidas.length; i++) {
            System.out.println(anosCopasVencidas[i]);
        }
    }
}