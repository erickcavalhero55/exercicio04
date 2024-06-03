//Crie uma matriz 3x3 de inteiros e preencha-a com valores. Verifique se a matriz é simétrica (ou seja, se é igual à sua transposta) e imprima o resultado.

public class exercicio20 {
    public static void main(String[] args) {
        int[][] matriz = { {1, 2, 3}, {2, 4, 5}, {3, 5, 6} };

        // Verificação de simetria
        boolean simetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Impressão do resultado
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}


