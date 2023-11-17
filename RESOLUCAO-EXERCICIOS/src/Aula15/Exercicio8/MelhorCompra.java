package Aula15.Exercicio8;

import java.util.Scanner;

public class MelhorCompra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do Produto 01");
        double produto1Preco = scan.nextDouble();

        System.out.println("Informe o valor do Produto 02");
        double produto2Preco = scan.nextDouble();

        System.out.println("Informe o valor do Produto 03");
        double produto3Preco = scan.nextDouble();

        if (produto1Preco < produto2Preco && produto1Preco < produto3Preco) {
            System.out.println("O Produto 01 é o mais barato, custando: R$" + produto1Preco);
        } else if (produto2Preco < produto1Preco && produto2Preco < produto3Preco) {
            System.out.println("O Produto 02 é o mais barato, custando: R$" + produto2Preco);
        } else {
            System.out.println("O Produto 03 é o mais barato, custando: R$" + produto3Preco);
        }

        scan.close();
    }
}
