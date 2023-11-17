package Aula15.Exercicio7;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double numero2 = scan.nextDouble();

        System.out.println("Digite o terciro número");
        double numero3 = scan.nextDouble();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O numero " + numero1 + " é o menor número digitado");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O número " + numero2 + " é o menor número digitado");
        } else {
            System.out.println("O numero " + numero3 + " é o menor número digitado");
        }

        scan.close();
    }
}
