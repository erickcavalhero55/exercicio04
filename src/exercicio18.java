//Crie duas matrizes 2x2 de inteiros, preencha-as com valores e calcule o produto das duas matrizes. Imprima a matriz resultante.

public class exercicio18 {
    public static void main(String[] args) {
        int[][] matriz1 = { {1, 2}, {3, 4} };
        int[][] matriz2 = { {5, 6}, {7, 8} };

        // Criação da matriz produto
        int[][] produto = new int[2][2];

        // Cálculo da matriz produto
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Impressão da matriz produto
        System.out.println("Matriz Produto:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}


