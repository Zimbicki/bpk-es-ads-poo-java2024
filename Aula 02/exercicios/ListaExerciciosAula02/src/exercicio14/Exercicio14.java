package exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite uma palavra ou frase: ");
        String palavra = sc.nextLine();

        char[] soletrar = palavra.toCharArray();
        int count = 0;
        for (int i = 0; i < soletrar.length; i++) {
            count++;
        }
        System.out.printf(" %d", count);
    }
}
