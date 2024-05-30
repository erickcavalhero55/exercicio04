//Escreva um programa que leita uma matriz 5 x 5 e um valor X. O programa deverá fazer uma
//busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma
//mensagem de “não encontrado”.

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        boolean encontrado = false;
        int linha = -1, coluna = -1;

        // Leitura da matriz 5x5
        System.out.println("Digite os valores para a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Leitura do valor X
        System.out.print("Digite o valor X para busca: ");
        int x = scanner.nextInt();

        // Busca do valor X na matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    encontrado = true;
                    linha = i;
                    coluna = j;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        // Exibição do resultado
        if (encontrado) {
            System.out.println("Valor " + x + " encontrado na posição: [" + linha + "][" + coluna + "]");
        } else {
            System.out.println("Valor " + x + " não encontrado na matriz.");
        }

        scanner.close();
    }
}



