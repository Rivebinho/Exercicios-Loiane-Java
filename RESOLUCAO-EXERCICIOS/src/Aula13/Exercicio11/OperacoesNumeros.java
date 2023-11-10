//Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo
package Aula13.Exercicio11;

import java.util.Scanner;

public class OperacoesNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um primeiro número (inteiro):");
        double numero1 = (int)scan.nextDouble();

        System.out.println("Informe um segundo número (inteiro):");
        double numero2 = (int)scan.nextDouble();

        System.out.println("Informe um terceiro número (real):");
        double numero3 = (int)scan.nextDouble();

        double questaoA = (numero1 * 2) * (numero2/2);
        double questaoB = (numero1 * 3) + numero3;
        double questaoC = Math.pow(numero3,3);

        System.out.println("O produto do dobro do primeiro com metade do segundo = " + questaoA);
        System.out.println("A soma do triplo do primeiro com o terceiro =  " + questaoB);
        System.out.println("O terceiro elevado ao cubo = " + questaoC);

        scan.close();

    }
}
