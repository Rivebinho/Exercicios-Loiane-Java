package Aula13.Exercicio16;

import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double areaPintar, coberturaLata, precoLata, precoTotal, qdeLatas;
        int qdeLatasFinal;
        precoLata = 80;
        coberturaLata = 18 * 3;


        System.out.println("Informe a área a ser pintada (m²):");
        areaPintar = scan.nextDouble();

        qdeLatas = (areaPintar / coberturaLata);
        qdeLatasFinal = (int) Math.ceil(qdeLatas); //convertendo latas para um numero inteiro

        precoTotal = qdeLatasFinal * precoLata;

        System.out.println("Quantidade de latas necessárias: " + qdeLatasFinal + " latas.");
        System.out.println("Valor total: R$" + precoTotal);

        scan.close();
    }
}
