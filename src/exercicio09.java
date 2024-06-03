//Crie um vetor de inteiros com 5 elementos, preencha-o com valores e calcule a média dos elementos do vetor. Imprima o resultado.

public class exercicio09 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("A média dos elementos do vetor é: " + media);
    }
}
