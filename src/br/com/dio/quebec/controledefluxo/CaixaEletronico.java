package br.com.dio.quebec.controledefluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.55;
        double valorSolicitado = 10.30;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor enviado para contagem, seu saldo é de: R$" + saldo);
        } else {
            System.out.println("Saldo Insuficiente");


        }
    }
}