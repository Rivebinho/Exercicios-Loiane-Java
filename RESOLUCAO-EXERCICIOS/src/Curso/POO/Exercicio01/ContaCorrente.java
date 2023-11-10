package Curso.POO.Exercicio01;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;


    boolean realizarSaque(double valorSaque){

        if (saldo >= valorSaque){    //verifica se tem saldo
            saldo -= valorSaque;
            return true;
        } else {
            return false;
            // to do - não tem saldo
        }
    }
}
