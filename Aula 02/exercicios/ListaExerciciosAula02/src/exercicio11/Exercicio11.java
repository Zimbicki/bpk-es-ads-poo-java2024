package exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite uma palavra: ");
        String word = sc.nextLine();
        String minusculo = word.toLowerCase();
        String reverse = inverterComStringBuilder(minusculo);
        if (minusculo.equals(reverse)) {
            System.out.printf(word + " EH UMA PALAVRA PALINDROMA");
        }else {
            System.out.printf("Essa palavra nao fica igual de tras para frente.");
        }
    }
    public static String inverterComStringBuilder(String palavra) {

        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();
    }
}

