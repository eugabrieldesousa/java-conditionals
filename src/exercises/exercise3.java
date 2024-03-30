package exercises;

import java.util.Scanner;

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.

public class exercise3 {
    public static void main(String[] args) {

        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
        scanner.close();
    }
}
