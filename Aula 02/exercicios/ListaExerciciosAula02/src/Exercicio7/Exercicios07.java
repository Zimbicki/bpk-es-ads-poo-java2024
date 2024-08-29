package Exercicio7;

import java.util.Scanner;

class Exercicios07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numberUser = sc.nextInt();

        System.out.print("Digite outra numero: ");
        int numberUser2 = sc.nextInt();

        System.out.println("A soma de " + numberUser + " + " + numberUser2 + " = " + soma(numberUser, numberUser2));
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
