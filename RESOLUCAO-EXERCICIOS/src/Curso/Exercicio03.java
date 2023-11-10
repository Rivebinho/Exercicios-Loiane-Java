package Curso;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz3x3 = new int[3][3];

        System.out.println("Preencha a matriz 3x3:");


        int contadorImpar = 0;
        int contadorPar = 0;

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                System.out.print("Informe o valor para a posição [" + i + "][" + j + "]: ");
                matriz3x3[i][j] = sc.nextInt();


                if (matriz3x3[i][j] % 2 == 0) {
                    contadorPar++;
                }

                if (matriz3x3[i][j] % 2 != 0) {
                    contadorImpar++;
                }
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPar);
        System.out.println("Quantidade de números ímpares: " + contadorImpar);

        sc.close();
    }
}
