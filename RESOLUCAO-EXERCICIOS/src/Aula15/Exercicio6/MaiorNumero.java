// Faça um Programa que leia três números e mostre o maior deles.
package Aula15.Exercicio6;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double numero2 = scan.nextDouble();

        System.out.println("Digite o terciro número");
        double numero3 = scan.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O numero " + numero1 + " é o maior número digitado");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é o maior número digitado");
        } else {
            System.out.println("O numero " + numero3 + " é o maior número digitado");
        }

        scan.close();
    }
}
