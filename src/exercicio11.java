//Crie uma matriz 2x2 de inteiros e inicialize-a com valores. Em seguida, imprima todos os elementos da matriz.

public class exercicio11 {
    public static void main(String[] args) {
        int[][] matriz = { {0, 2}, {3, 4} };

        // Impressão dos elementos da matriz
        System.out.println("Elementos da matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
