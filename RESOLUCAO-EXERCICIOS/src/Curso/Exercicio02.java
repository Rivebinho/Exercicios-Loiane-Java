package Curso;

public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matrixAleatorios = new int[10][10];

        int valorMin = 1;
        int valorMax = 9;

        for (int i=0; i<matrixAleatorios.length; i++){
            for (int j=0; j< matrixAleatorios.length; j++) {
                int random_int = (int)Math.floor(Math.random() * (valorMax - valorMin + 1) + valorMin);
                matrixAleatorios[i][j] = random_int;
                System.out.println("[" + i + "][" + j + "]" + " = " + matrixAleatorios[i][j]);
            }
        }

        int linhaDesejada = 5;
        int colunaDesejada = 7;

        int linhaMin = Integer.MAX_VALUE;
        int linhaMax = Integer.MIN_VALUE;

        int colunaMin = Integer.MAX_VALUE;
        int colunaMax = Integer.MIN_VALUE;

        for (int i=0; i < matrixAleatorios[linhaDesejada].length; i++){
            int valorLinha5 = matrixAleatorios[linhaDesejada][i];
            if (valorLinha5 < linhaMin) {
                linhaMin = valorLinha5;
            }

            if (valorLinha5 > linhaMax) {
                linhaMax = valorLinha5;
            }

            int valorColuna7 = matrixAleatorios[i][colunaDesejada];
            if (valorColuna7 < colunaMin){
                colunaMin = valorColuna7;
            }

            if (valorColuna7 > colunaMax){
                colunaMax = valorColuna7;
            }
        }

        System.out.println("5 " + linhaMin + " - " + linhaMax);
        System.out.println("7 " + colunaMin + " - " + colunaMax);


//        int maiorNumero = matrixAleatorios[0][0];
//        int i = 0;
//        int j = 0;
//        int buscarValor = matrixAleatorios[0][0];
//        for (i = 5; i < matrixAleatorios.length; i++) {
//            for (j = 0; j < matrixAleatorios[i].length; j++) {
//                buscarValor = matrixAleatorios[i][j];
//                if (buscarValor > maiorNumero) {
//                    maiorNumero = buscarValor;
//                }
//            }
//        }


    }
}
