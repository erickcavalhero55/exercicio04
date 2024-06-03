// Crie uma matriz 2x2 de inteiros e preencha-a com valores. Em seguida, encontre e imprima o maior e o menor elemento da matriz.

public class exercicio13 {
    public static void main(String[] args) {
        int[][] matriz = { {5, 8}, {3, 6} };

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior elemento da matriz é: " + maior);
        System.out.println("O menor elemento da matriz é: " + menor);
    }
}


