//Faça um Programa que peça dois números e imprima a soma.

package Aula13.Exercicio03;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        double numero2 = scan.nextInt();

        double soma = numero1+numero2;
        System.out.println("A soma dos número digitados é: " + numero1 + " + " + numero2 + " = " + soma);

        scan.close();

    }
}
