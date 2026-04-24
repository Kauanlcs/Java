import java.util.Scanner;

public class Ex04DivisãoControlada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");

        int primeiro = sc.nextInt();

        int numero;

        do {

            System.out.print("Digite outro número: ");

            numero = sc.nextInt();

        } while (numero % primeiro == 0);

        System.out.println("Número inválido digitado. Encerrando...");

        sc.close();
    }
}
