package exercicio08;

import java.util.Scanner;
class Evercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ = 1 \n- = 2 \n* = 3 \n/ = 4");
        System.out.println("Digite um operador matemático: ");
        int operator = sc.nextInt();
        System.out.print("Digite um numero: ");
        int numberUser = sc.nextInt();
        System.out.print("Digite outra numero: ");
        int numberUser2 = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("A soma de " + numberUser + " e " + numberUser2 + " = " + soma(numberUser, numberUser2));
                break;

            case 2:
                System.out.println("A subtração de " + numberUser + " e " + numberUser2 + " = " + sub(numberUser, numberUser2));
                break;

            case 3:
                System.out.println("A multiplicação de " + numberUser + " e " + numberUser2 + " = " + multi(numberUser, numberUser2));
                break;

            case 4:
                System.out.println("A divisão de " + numberUser + " por " + numberUser2 + " = " + div(numberUser, numberUser2));
                break;
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }
}

