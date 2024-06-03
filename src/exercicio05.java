//Crie um vetor de inteiros com 5 elementos, preencha-o com valores e calcule a soma de todos os elementos do vetor. Imprima o resultado.

public class exercicio05 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}

