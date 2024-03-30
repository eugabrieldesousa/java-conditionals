package exercises;

import java.util.Scanner;

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

public class exercise5 {
    public static void main(String[] args) {
        int codigoItem;
        int quantidadeItem;
        double precoItem;
        String especificacaoItem;
        double precoFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do item: ");
        codigoItem = scanner.nextInt();

        System.out.println("Digite a quantidade do item: ");
        quantidadeItem = scanner.nextInt();

        if (codigoItem == 1) {
            precoItem = 4.0;
            especificacaoItem = "Cachorro quente";
            precoFinal = quantidadeItem * precoItem;

            System.out.println("Total do " + especificacaoItem + ": " + precoFinal);
        } else if (codigoItem == 2) {
            precoItem = 4.50;
            especificacaoItem = "X-Salada";
            precoFinal = quantidadeItem * precoItem;
            System.out.println("Total do " + especificacaoItem + ": " + precoFinal);
        } else if (codigoItem == 3) {
            precoItem = 5.00;
            especificacaoItem = "X-Bacon";
            precoFinal = quantidadeItem * precoItem;
            System.out.println("Total do " + especificacaoItem + ": " + precoFinal);
        } else if (codigoItem == 4) {
            precoItem = 2.00;
            especificacaoItem = "Torrada Simples";
            precoFinal = quantidadeItem * precoItem;
            System.out.println("Total do " + especificacaoItem + ": " + precoFinal);
        } else if (codigoItem == 5) {
            precoItem = 1.50;
            especificacaoItem = "Refrigerante";
            precoFinal = quantidadeItem * precoItem;
            System.out.println("Total do " + especificacaoItem + ": " + precoFinal);
        }

        scanner.close();
    }
}
