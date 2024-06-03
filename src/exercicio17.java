// Crie duas matrizes 2x2 de inteiros, preencha-as com valores e calcule a soma das duas matrizes. Imprima a matriz resultante.

public class exercicio17 {
    public static void main(String[] args) {
        int[][] matriz1 = { {1, 2}, {3, 4} };
        int[][] matriz2 = { {5, 6}, {7, 8} };

        // Criação da matriz soma
        int[][] soma = new int[2][2];

        // Cálculo da matriz soma
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Impressão da matriz soma
        System.out.println("Matriz Soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}


