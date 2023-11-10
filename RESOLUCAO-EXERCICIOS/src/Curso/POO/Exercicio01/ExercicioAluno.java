package Curso.POO.Exercicio01;

import java.util.Scanner;

public class ExercicioAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com a matrícula");
        aluno.matricula = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();

        aluno.nomeDisciplinas = new String[3];

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {

            System.out.println("Entre com a Disciplina número " + (i + 1));
            aluno.nomeDisciplinas[i] = scan.next();
        }
        aluno.notasDisciplinas = new double[3][4];
        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado.");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado.");
            }

        }

        System.out.println("\nMédias de Todas as Disciplinas:");
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            double mediaDaDisciplina = aluno.obterMedia(i);
            System.out.println(aluno.nomeDisciplinas[i] + ": " + mediaDaDisciplina);

        }

    }

}
