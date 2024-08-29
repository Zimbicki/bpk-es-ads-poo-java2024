package exercicio13;

import java.util.Random;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int inteiroAleatorioLimite = random.nextInt(100 + 1);
        for (int i = 0, b = 0; i == 0; b++) {
            System.out.printf("Digite sua tentativa de chute: ");
            int tentativa = sc.nextInt();
            if (tentativa == inteiroAleatorioLimite){
                System.out.printf("ACERTOUUUUUU \nTentativa de chute: %d\n", inteiroAleatorioLimite);
                i = 1;
            }else {
                System.out.println("ERROUUUUUUU");
            }
        }
    }
}
