package Aula13.Exercicio12;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular seu peso ideal.");
        System.out.println("Informe a sua altura:");

        double altura = scan.nextDouble();
        double pesoIdeal = (altura*72.7) - 58;

        System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");

        scan.close();
    }
}
