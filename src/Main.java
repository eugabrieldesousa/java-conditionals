import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String comprimento1 = "Bom dia", comprimento2 = "Boa tarde", comprimento3 = "Boa Noite";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 3:");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println(comprimento1);
        } else if (opcao == 2) {
            System.out.println(comprimento2);
        } else if (opcao == 3) {
            System.out.println(comprimento3);
        } else {
            System.out.println("Opção Inválida");

        }
    }
}