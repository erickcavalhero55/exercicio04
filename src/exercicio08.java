//Crie um vetor de inteiros com 5 elementos e preencha-o com valores. Crie um novo vetor que armazene os elementos na ordem inversa e imprima o novo vetor.

public class exercicio08 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        // Criação do vetor reverso
        int[] reverso = new int[numeros.length];

        // Preenchimento do vetor reverso
        for (int i = 0; i < numeros.length; i++) {
            reverso[i] = numeros[numeros.length - 1 - i];
        }

        // Impressão dos elementos do vetor reverso
        System.out.println("Elementos do vetor reverso:");
        for (int i = 0; i < reverso.length; i++) {
            System.out.println(reverso[i]);
        }
    }
}


