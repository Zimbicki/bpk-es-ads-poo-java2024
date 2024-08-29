package exercicio12;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        for (int i = 5; i >= 0; i--) {
            System.out.println("Digite " + i + " numero: ");
            vetor[i] = sc.nextInt();
        }
        Arrays.sort(vetor);
        System.out.println("Array ordenado: " + Arrays.toString(vetor));
    }
}
