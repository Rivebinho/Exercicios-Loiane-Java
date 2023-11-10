// Faça um Programa que peça dois números e imprima o maior deles
package Aula15.Exercicio1;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos comparar dois números e verificar qual o maior");
        System.out.println("Informe o primeiro número:");
        double numero1 = scan.nextDouble();

        System.out.println("Informe o segundo número:");
        double numero2 = scan.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        } else {
            System.out.println("Os números digitados são iguais");
        }

        scan.close();
    }
}
