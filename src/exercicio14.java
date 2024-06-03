//Crie uma matriz 3x3 que seja uma matriz identidade. Imprima a matriz.

public class exercicio14 {
    public static void main(String[] args) {
        int[][] matrizIdentidade = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz Identidade:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }
    }
}