//Crie um vetor de inteiros com 5 elementos e preencha-o com valores. Crie um novo vetor que armazene o dobro dos valores do vetor original e imprima o novo vetor.

public class exercicio10 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int[] duplicado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            duplicado[i] = numeros[i] * 2;
        }

        System.out.println("Elementos do vetor duplicado:");
        for (int i = 0; i < duplicado.length; i++) {
            System.out.println(duplicado[i]);
        }
    }
}