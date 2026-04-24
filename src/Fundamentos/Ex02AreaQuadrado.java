package Fundamentos;

import java.util.Scanner;
    public class Ex02AreaQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado:");

        double lado = scanner.nextDouble();
        double area = lado*lado;

            System.out.println("Area do quadrado: "+ area);

    }
}

