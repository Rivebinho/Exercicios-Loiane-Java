//Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário
package Aula13.Exercicio07;

import java.util.Scanner;

public class DobroAreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho (cm) do lado do quadrado que deseja calcular a área:");
        double lado = scan.nextDouble();

        double area = lado * lado;
        System.out.println("A área do quadrado informado é: " + area + "cm²");
        System.out.println("E o dobro desta área é: " + 2*area + " cm²");


        scan.close();
    }
}
