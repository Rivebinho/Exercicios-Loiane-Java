//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

package Aula15.Exercicio3;

import java.util.Scanner;

public class FemininoMasculino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while (true){

            System.out.println("Digite F ou M");
            char letra = scan.next().charAt(0);

            if (letra == 'F' || letra == 'f'){
                System.out.println("Feminino");
                break;
            } else if (letra == 'M' || letra == 'm') {
                System.out.println("Masculino");
                break;
            } else {
                System.out.println("Escolha inválida" + "\n");
            }
        }
    }
}
