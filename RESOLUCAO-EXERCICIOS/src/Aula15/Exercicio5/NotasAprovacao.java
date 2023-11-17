//Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar:
//o A mensagem "Aprovado", se a média alcançada for maior ou
//igual a sete;
//o A mensagem "Reprovado", se a média for menor do que sete;
//o A mensagem "Aprovado com Distinção", se a média for igual a
//dez.
package Aula15.Exercicio5;

import java.util.Scanner;

public class NotasAprovacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media != 10){
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado com Distinção");
        }
    scan.close();
    }
}
