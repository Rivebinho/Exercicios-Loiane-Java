//Faça um Programa que converta metros para centímetros.
package Aula13.Exercicio05;

import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida em metros: ");
        double metros = scan.nextDouble();

        double conversao = metros * 100;

        System.out.println("O valor informado corresponde a: " + conversao + "cm.");

        scan.close();
    }
}
