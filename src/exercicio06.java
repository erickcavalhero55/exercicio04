//Crie um vetor de inteiros com 5 elementos e preencha-o com valores. Em seguida, encontre e imprima o maior e o menor elemento do vetor.

public class exercicio06 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 5};

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior);
        System.out.println("O menor elemento do vetor é: " + menor);
    }
}


