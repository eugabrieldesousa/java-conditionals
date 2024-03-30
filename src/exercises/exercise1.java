package exercises;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class exercise1 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo!");
        } else if (numero >= 0) {
            System.out.println("O número é positivo!");
        }
    }
}