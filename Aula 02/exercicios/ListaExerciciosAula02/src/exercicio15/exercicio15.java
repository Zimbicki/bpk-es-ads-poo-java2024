package exercicio15;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado ");
        int num = sc.nextInt();
        iteracaoFatorial(num);
        System.out.println(recursaoFatorial(num));
    }
    public static void iteracaoFatorial (int a){
        int resultado = 1;
        for (int i = 1; i <= a; i++) {
            resultado *= i;
        }
        System.out.println(resultado);
    }
    public static int recursaoFatorial (int a){
        if(a == 0){
            return 1;
        }else{
            return a * recursaoFatorial(a-1);
        }
    }
}
