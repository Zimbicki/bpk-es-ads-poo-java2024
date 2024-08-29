package exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        boolean primaiada = primo(numero);
        if (primaiada == true){
            System.out.printf(numero + " ELE EH PRIMO KARAIO");
        }else{
            System.out.printf(numero + " NAO EH PRIMO KARAIO");
        }
    }
    public static boolean primo(int n) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(n % i == 0){
                count++;
            }
        }
        if(count <= 2){
            return true;
        }
        else{
            return false;
        }
    }
}
