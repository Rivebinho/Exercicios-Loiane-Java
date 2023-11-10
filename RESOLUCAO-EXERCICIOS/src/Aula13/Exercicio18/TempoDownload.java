//Faça um programa que peça o tamanho de um arquivo para download
//(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
//informe o tempo aproximado de download do arquivo usando este link
//(em minutos)

package Aula13.Exercicio18;

import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Tamanho do arquivo (MB) a ser baixado:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Velocidade (Mbps) do link de internet:");
        double velocidade = scan.nextDouble();

        double tempoEstimado = (tamArquivo * 8) / velocidade;

        System.out.println("O tempo estimado de para o download é: " + tempoEstimado + "s");

        scan.close();
    }
}