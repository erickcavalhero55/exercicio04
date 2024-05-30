//Faça um programa que leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10
//ela possui.

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int count = 0;


        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > 10) {
                    count++;
                }
            }
        }

1
        System.out.println("A matriz possui " + count + " valores maiores que 10.");

        scanner.close();
    }
}


