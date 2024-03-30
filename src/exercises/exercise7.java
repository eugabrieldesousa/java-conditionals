package exercises;

import java.util.Scanner;

// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
// Se o ponto estiver na origem, escreva a mensagem “Origem”.
// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
// situação.

public class exercise7 {
    public static void main(String[] args) {
        double valor1, valor2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        valor1 = scanner.nextDouble();
        System.out.println("Digite o valor 2: ");
        valor2 = scanner.nextDouble();

        if (valor1 == 0 && valor2 == 0) {
            System.out.println("Origem");
        } else if (valor1 == 0) {
            System.out.println("Eixo Y");
        } else if (valor2 == 0) {
            System.out.println("Eixo X");
        } else if (valor1 > 0 && valor2 > 0) {
            System.out.println("Quadrante I");
        } else if (valor1 > 0 && valor2 < 0) {
            System.out.println("Quadrante II");
        } else if (valor1 < 0 && valor2 > 0) {
            System.out.println("Quadrante III");
        } else if (valor1 < 0 && valor2 < 0) {
            System.out.println("Quadrante IV");
        }
        
    }
}
