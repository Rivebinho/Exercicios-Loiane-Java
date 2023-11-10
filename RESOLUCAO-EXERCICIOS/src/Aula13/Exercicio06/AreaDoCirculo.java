//Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área.
package Aula13.Exercicio06;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo que deseja calcular a área:");
        double raio = scan.nextDouble();

        double calculoArea = 2 * raio * Math.PI;

        System.out.println("A área do círculo de raio " + raio + " é: " + calculoArea);

        scan.close();
    }
}
