import java.util.Scanner;

public class Ex03ParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");

        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");

        int n2 = sc.nextInt();


        System.out.print("Digite 1 para PAR ou 2 para ÍMPAR: ");

        int opcao = sc.nextInt();

        for (int i = n2; i >= n1; i--) {

            if (opcao == 1 && i % 2 == 0) {

                System.out.println(i);

            }

            if (opcao == 2 && i % 2 != 0) {

                System.out.println(i);

            }

        }

        sc.close();
    }
}

