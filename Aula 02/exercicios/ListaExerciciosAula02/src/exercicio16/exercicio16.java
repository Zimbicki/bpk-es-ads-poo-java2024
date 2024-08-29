package exercicio16;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Converter para c - Celsius ou f - Fahrenheit");
        char choice = sc.next().charAt(0);
        System.out.println("Qual a temperatura deseja converter?");
        int temperatura = sc.nextInt();
        switch (choice) {
            case 'c':
                System.out.println("Celsius: " + fahrenheitToCelsius(temperatura));
                break;
            case 'f':
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(temperatura));
                break;
        }
    }
    public static int celsiusToFahrenheit(int celsius) {
        int fahrenheit = (celsius * (9 / 5)) + 32;
        return fahrenheit;
    }
    public static int fahrenheitToCelsius(int fahrenheit) {
        int celsius = (fahrenheit - 32) / 9;
        return celsius;
    }
}