// Crie uma matriz 3x3 de inteiros e preencha-a com valores. Multiplique todos os elementos da matriz por um número inteiro (escalar) e imprima a nova matriz.

public class exercicio15 {
    public static void main(String[] args) {

        int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int escalar = 2;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
            }
        }


        System.out.println("Matriz multiplicada por " + escalar + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
