//Crie uma matriz 2x2 de inteiros, preencha-a com valores e calcule a soma de todos os elementos da matriz. Imprima o resultado.

public class exercicio12 {
    public static void main(String[] args) {
        int[][] matriz = { {1, 2}, {3, 4} };

        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}