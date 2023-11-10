package Curso;

import java.util.Scanner;

public class Exercicio06 {

    public static String[][] jogoDaVelha = new String[3][3];
    public static boolean jogoAcabou = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        for (i = 0; i < jogoDaVelha.length; i++) {
            for (j = 0; j < jogoDaVelha[i].length; j++) {
                if (jogoDaVelha[i][j] == null) {
                    jogoDaVelha[i][j] = "-";
                }
            }
        }

        while (!jogoAcabou) {
            System.out.println("Jogador 01, informe a linha e coluna para jogar: ");
            int escolha01 = sc.nextInt();
            if (realizarJogada(escolha01, "X")) {
                exibirTabuleiro();
                verificacao();
            } else {
                System.out.println("Posição já ocupada. Escolha outra.");
                continue; // Volta ao início do loop
            }

            if (jogoAcabou) {
                break;
            }

            System.out.println("Jogador 02, informe a linha e coluna para jogar: ");
            int escolha02 = sc.nextInt();
            if (realizarJogada(escolha02, "O")) {
                exibirTabuleiro();
                verificacao();
            } else {
                System.out.println("Posição já ocupada. Escolha outra.");
                continue; // Volta ao início do loop
            }
        }

        sc.close();
    }

    public static boolean realizarJogada(int escolha, String jogador) {
        int linha = (escolha - 1) / 3;
        int coluna = (escolha - 1) % 3;

        if (jogoDaVelha[linha][coluna].equals("-")) {
            jogoDaVelha[linha][coluna] = jogador;
            return true; // Jogada válida
        } else {
            return false; // Posição já ocupada
        }
    }

    public static void exibirTabuleiro() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void verificacao() {
        if (verificarVitoria("X")) {
            System.out.println("Jogador 01 (X) ganhou!");
            jogoAcabou = true;
        } else if (verificarVitoria("O")) {
            System.out.println("Jogador 02 (O) ganhou!");
            jogoAcabou = true;
        } else if (tabuleiroCheio()) {
            System.out.println("O jogo empatou!");
            jogoAcabou = true;
        }
    }

    public static boolean verificarVitoria(String jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (jogoDaVelha[i][0].equals(jogador) && jogoDaVelha[i][1].equals(jogador) && jogoDaVelha[i][2].equals(jogador)) {
                return true;
            }
        }

        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (jogoDaVelha[0][j].equals(jogador) && jogoDaVelha[1][j].equals(jogador) && jogoDaVelha[2][j].equals(jogador)) {
                return true;
            }
        }

        // Verificar diagonais
        if (jogoDaVelha[0][0].equals(jogador) && jogoDaVelha[1][1].equals(jogador) && jogoDaVelha[2][2].equals(jogador)) {
            return true;
        }
        if (jogoDaVelha[0][2].equals(jogador) && jogoDaVelha[1][1].equals(jogador) && jogoDaVelha[2][0].equals(jogador)) {
            return true;
        }

        return false;
    }

    public static boolean tabuleiroCheio() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                if (jogoDaVelha[i][j].equals("-")) {
                    return false; // Ainda há espaço vazio no tabuleiro
                }
            }
        }
        return true; // O tabuleiro está cheio (empate)
    }
}
