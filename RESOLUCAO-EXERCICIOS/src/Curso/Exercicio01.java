package Curso;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] aleatorios = new int[4][4];

        aleatorios[0][0] = 1;
        aleatorios[0][1] = 2;
        aleatorios[0][2] = 3;
        aleatorios[0][3] = 4;

        aleatorios[1][0] = 5;
        aleatorios[1][1] = 6;
        aleatorios[1][2] = 7;
        aleatorios[1][3] = 8;

        aleatorios[2][0] = 9;
        aleatorios[2][1] = 1;
        aleatorios[2][2] = 2;
        aleatorios[2][3] = 3;

        aleatorios[3][0] = 4;
        aleatorios[3][1] = 5;
        aleatorios[3][2] = 9;
        aleatorios[3][3] = 7;

        int maiorNumero = aleatorios[0][0];
        int i = 0;
        int j = 0;
        int buscarValor = aleatorios[0][0];
        for (i = 0; i < aleatorios.length; i++) {
            for (j = 0; j < aleatorios[i].length; j++) {
                buscarValor = aleatorios[i][j];
                if (buscarValor > maiorNumero) {
                    maiorNumero = buscarValor;
                }
            }
        }

        System.out.println("O Maior número encontrado foi: " + maiorNumero);

        int k = 0;
        int l = 0;
        for (k = 0; k < aleatorios.length; k++) {
            for (l = 0; l < aleatorios[k].length; l++) {
                if (aleatorios[k][l] == maiorNumero) {
                    System.out.println("Está na posição: [" + k + "][" + l + "]");
                }
            }
        }
    }
}

