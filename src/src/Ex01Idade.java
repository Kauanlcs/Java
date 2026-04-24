import java.util.Scanner;
    public class Ex01Idade {
    public static void main(String[]  args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite seu nome por gentileza: ");
      String nome= scanner.nextLine();
      System.out.println("Digite seu ano de nascimento: ");

      int ano = scanner.nextInt();
      int idade = 2026-ano;

      System.out.println("Olá " + nome + ", oc tem " +  idade  + " anos de idade.");

    }
}