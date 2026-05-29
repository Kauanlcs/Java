import java.util.Scanner;

public class CalculadoraMenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        double num1, num2, resultado, resto;

        do {

            System.out.println("---------------------------------------");
            System.out.println("🧮CALCULADORA COM MENU INTERATIVO🧮 ");
            System.out.println("-----------------------------------------");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Potência");
            System.out.println("6- Sair");
            System.out.println("------------------------------------------");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            //Verifica opções
            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Digite seu primeiro número: ");
                num1 = scanner.nextDouble();

                System.out.print("Digite seu segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:

                        resultado = num1 + num2;

                        int subOpcao;

                        do {

                            System.out.println("Resultado atual da Soma: " + resultado);
                            System.out.println("1 - Informar mais números");
                            System.out.println("2 - Sair da operação");
                            System.out.print("Escolha uma opção: ");
                            subOpcao = scanner.nextInt();
                            if(subOpcao == 1) {

                                System.out.print("Digite outro número: ");
                                double novonumero = scanner.nextDouble();

                                resultado = resultado + novonumero;
                            }

                        } while(subOpcao != 2);
                        break;

                    case 2:
                        resultado = num1 - num2;
                        int subOpcao2;

                        do {

                            System.out.println("Resultado atual da Subtração: " + resultado);
                            System.out.println("1 - Informar mais números");
                            System.out.println("2 - Sair da operação");
                            System.out.println("Escolha uma opção: ");
                            subOpcao2 = scanner.nextInt();
                            if(subOpcao2 == 1) {
                                System.out.print("Digite outro número: ");
                                double novonumero = scanner.nextDouble();

                                resultado = resultado - novonumero;
                            }

                        } while(subOpcao2 != 2);

                        break;

                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado daa Multiplicação:" + resultado);
                        break;


                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                       resto = num1 % num2;
                            System.out.println("Resultado da Divisão:" + resultado);
                            System.out.println("Resto da Divisão: " + resto);
                        } else {
                            System.out.println("Erro seu desavisado: Divisão por zero não é permitida!");
                        }
                        break;

                    case 5:
                        resultado = Math.pow(num1, num2);
                        System.out.println("Resultado da Potência:" + resultado);
                        break;

                }

                System.out.println("");
                System.out.println("Por gentileza, pressione 0 para voltar ao menu inicial...");
                opcao = scanner.nextInt();

            } else if (opcao == 6) {
                System.out.print("Essa não é uma despedida… é só um novo começo. Até logo!");

            } else {
                System.out.println("Opção inválida!");
                System.out.println("Pressione ENTER para continuar...");
                scanner.nextLine();
                scanner.nextLine();

            }
        } while (opcao != 6);
        scanner.close();
    }
}

