package br.com.dio.quebec.metodos;

import java.util.Calendar;
import java.util.Scanner;

public class ExercicioMetodosMyTry {

    public static void main(String[] args) {

        int a, b;
        double c, d, e;
        Scanner scan = new Scanner(System.in);


        System.out.println(Saudacao());
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        System.out.println("Digite o valor do emprestimo: ");
        c = scan.nextInt();
        System.out.println("Digite o valor da parcela: ");
        d = scan.nextInt();
        System.out.println("Digite a % da taxa: ");
        e = scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        double divisao = divisao(a, b);
        double emprestimo = emprestimo(a, b, c);


        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Quantidade de parcelas: " + emprestimo);
    }

    public static String Saudacao() {

        Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);

            if (hora > 6 && hora < 12) {
                System.out.println("Bom Dia");
            } else if (hora > 12 && hora < 18) {
                System.out.println("Boa Tarde");
            } else {
                System.out.println("Boa Noite");
            }
            return null;
        }



    private static double emprestimo(double c, double d, double e) {

        double valorEmprestimo = 0;
        c = valorEmprestimo;

        int parcela = 1;
        d = parcela;

        double taxa = 1.02;
        e = taxa;

        double taxaPorParcela;

        taxaPorParcela = parcela * taxa;
        valorEmprestimo = valorEmprestimo * taxaPorParcela;

        return valorEmprestimo;
    }
    private static int soma(int a, int b) {
        return a + b;
    }

    private static int subtracao(int a, int b) {
        return a - b;
    }

    private static int multiplicacao(int a, int b) {
        return a * b;
    }

    private static double divisao(double a, double b) {
        return a / b;
    }
}

