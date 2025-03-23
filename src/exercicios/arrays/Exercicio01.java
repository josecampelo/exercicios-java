package exercicios.arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] anosCopasVencidas = {1958, 1962, 1970, 1994, 2002};

        System.out.println("Brasil foi campeão em " + anosCopasVencidas.length + " copas");

        for (int anoCopaVencida : anosCopasVencidas) {
            System.out.println("Campeão em " + anoCopaVencida);
        }
    }
}