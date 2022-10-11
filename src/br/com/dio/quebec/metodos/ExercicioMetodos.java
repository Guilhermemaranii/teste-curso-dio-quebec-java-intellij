package br.com.dio.quebec.metodos;

import java.util.Calendar;
import java.util.Scanner;

public class ExercicioMetodos {

    public static void main(String[] args) {

        int a, b;
        Scanner scan = new Scanner(System.in);


        System.out.println(mensagem());
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        double divisao = divisao(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    public static String mensagem() {
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

