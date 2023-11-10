package Curso;

public class Aula20 {
    public static void main(String[] args) {
        double [][] notasAlunos = new double[2][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9.5;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 10;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 8.5;

        //imprimindo valores
        for (int i=0; i < notasAlunos.length; i++){
            for (int j= 0; j < notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j] + " -- ");
            }
            System.out.println();
        }
    }
}
