//Crie uma matriz 3x3 de inteiros e preencha-a com valores. Imprima os elementos da diagonal principal da matriz.

public class exercicio19 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Impressão dos elementos da diagonal principal
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
