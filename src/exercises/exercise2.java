package exercises;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

public class exercise2 {
    public static void main(String[] args) {
         int numero;

        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();

        if(numero % 2 == 0) {
            System.out.println(numero + " é par");
        }else if(numero % 2 == 1){
            System.out.println(numero + " é ímpar");
        }

        scanner.close();
    }
}
