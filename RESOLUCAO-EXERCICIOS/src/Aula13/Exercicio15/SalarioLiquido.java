package Aula13.Exercicio15;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorHora, qdeHoras, salarioBruto, impostoRenda, inss, sindicato, salarioLiquido, descontos;


        System.out.println("Informe o valor da hora trabalhada (em R$):");
        valorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        qdeHoras = scan.nextDouble();

        //INICIALIZANDO CÁLCULO DAS VARIÁVEIS
        salarioBruto = valorHora * qdeHoras;
        impostoRenda = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        descontos = impostoRenda + inss + sindicato;
        salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("IR (11%): R$ " + impostoRenda);
        System.out.println("INSS (8%): R$ " + inss);
        System.out.println("Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scan.close();
    }
}
