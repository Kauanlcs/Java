import java.util.Scanner;

public class Ex04DiferencaIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");

        sc.close();
    }
}}