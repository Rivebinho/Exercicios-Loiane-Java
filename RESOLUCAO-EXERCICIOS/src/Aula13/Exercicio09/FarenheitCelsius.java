//Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//ºC = (5 * (F-32) / 9)
package Aula13.Exercicio09;

import java.util.Scanner;

public class FarenheitCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em ºF para ser convertida:");
        double tempF = scan.nextDouble();

        double tempC = (tempF-32) * 5/9;

        System.out.println("A conversão de " + tempF + "ºF é: " + tempC + "ºC.");

        scan.close();
    }
}
