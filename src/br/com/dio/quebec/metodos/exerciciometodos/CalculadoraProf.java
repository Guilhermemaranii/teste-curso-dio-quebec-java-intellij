package br.com.dio.quebec.metodos.exerciciometodos;

public class CalculadoraProf {

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + resultado);
    }

    public static void subtrair(double numero1, double numero2){
        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " - " + numero2 + " é: " + resultado);
    }
    public static void multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é: " + resultado);
    }
    public static void dividir(double numero1, double numero2){
        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é: " + resultado);
    }
}
