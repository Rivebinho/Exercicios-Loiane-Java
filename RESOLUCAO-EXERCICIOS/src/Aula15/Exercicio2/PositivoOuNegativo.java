// Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.
package Aula15.Exercicio2;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número e vamos verificar se é negativo ou positivo:");
        double numero = scan.nextDouble();

        if (numero > 0){
            System.out.println("O número informado é positivo");
        } else if (numero < 0) {
            System.out.println("O número informaod é negativo");
        } else {
            System.out.println("O número informado é 0");
        }

        scan.close();
    }
}
