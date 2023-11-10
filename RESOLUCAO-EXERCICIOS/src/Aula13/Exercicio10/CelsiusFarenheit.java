//Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit
package Aula13.Exercicio10;

import java.util.Scanner;

public class CelsiusFarenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em ºC para ser convertida:");
        double tempC = scan.nextDouble();

        double tempF = tempC * 9/5 + 32;

        System.out.println("A conversão de " + tempC + "ºC é: " + tempF + "ºF.");

        scan.close();
    }
}
