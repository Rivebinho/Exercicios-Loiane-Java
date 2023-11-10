//Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês
package Aula13.Exercicio08;

import java.util.Scanner;

public class SalarioHoras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O salário do mês é: R$" + salario);

        scan.close();
    }
}
