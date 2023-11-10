package Aula13.Exercicio14;

import java.util.Scanner;

public class Pescaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Peso de peixes em Kg:");
        double peso = scan.nextDouble();
        double excesso = 0;

        if (peso > 50) {
            excesso = peso - 50;
        }
        double multa = 0;

        if (excesso > 0) {
            multa = excesso * 4;
            System.out.println("O peso limite foi excedido em " + excesso + " quilos.");
            System.out.println("Será cobrada uma multa no valor de R$" + multa);
        } else {
            System.out.println("Não houve excesso no limite de peso");
            System.out.println("Valor da multa: R$" + multa);
        }

        scan.close();
    }
}
