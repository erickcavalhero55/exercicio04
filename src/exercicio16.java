// Crie uma matriz 2x3 de inteiros e preencha-a com valores. Crie uma nova matriz que seja a transposta da matriz original e imprima a nova matriz.

public class exercicio16 {
    public static void main(String[] args) {
        int[][] matrizOriginal = { {1, 2}, {3, 4}, {5, 6} };

        // Criação da matriz transposta
        int[][] transposta = new int[matrizOriginal[0].length][matrizOriginal.length];

        // Preenchimento da matriz transposta
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[0].length; j++) {
                transposta[j][i] = matrizOriginal[i][j];
            }
        }

        // Impressão da matriz original
        System.out.println("Matriz Original:");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[0].length; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        // Impressão da matriz transposta
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}