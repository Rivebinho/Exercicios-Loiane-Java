//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package Aula13.Exercicio04;

import java.util.Scanner;

public class NotasBimestre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double notaBimestre1, notaBimestre2, notaBimestre3, notaBimestre4, media;

        System.out.println("Informe a nota do Primeiro Bimestre:");
        notaBimestre1 = scan.nextDouble();

        System.out.println("Informe a nota do Segundo Bimestre:");
        notaBimestre2 = scan.nextDouble();

        System.out.println("Informe a nota do Terceiro Bimestre:");
        notaBimestre3 = scan.nextDouble();

        System.out.println("Informe a nota do Quarto Bimestre:");
        notaBimestre4 = scan.nextDouble();

        media = (notaBimestre1 + notaBimestre2 + notaBimestre3 + notaBimestre4) / 4;

        System.out.println("A média bimestral é: " + media);

        scan.close();
    }
}
