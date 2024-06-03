//Crie um vetor de inteiros com 10 elementos e preencha-o com valores. Conte quantos números pares existem no vetor e imprima o resultado.

public class exercicio07 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int Pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                Pares++;
            }
        }

        System.out.println("A quantidade de números pares no vetor é: " + Pares);
    }
}

