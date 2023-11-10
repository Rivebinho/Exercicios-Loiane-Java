package Curso;

public class Aula19 {
    public static void main(String[] args) {

        double[] temperaturas = new double[7];

        temperaturas[0] = 33;
        temperaturas[1] = 33.1;
        temperaturas[2] = 34.1;
        temperaturas[3] = 30.9;
        temperaturas[4] = 32.5;
        temperaturas[5] = 33;
        temperaturas[6] = 33.9;

        System.out.println("A temperatura no dia 1 foi: " + temperaturas[0] + "ºC");

        //imprimindo todos os valores da array
        for (int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " foi: " + temperaturas[i] + "ºC");
        }

        //for melhorado (imprime apenas a array completa)
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
