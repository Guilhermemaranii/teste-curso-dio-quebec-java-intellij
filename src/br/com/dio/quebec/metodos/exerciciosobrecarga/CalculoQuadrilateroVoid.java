package br.com.dio.quebec.metodos.exerciciosobrecarga;

public class CalculoQuadrilateroVoid {

    public static void area(double lado){
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }

    public static double area(double ladoMaior, double ladoMenor){
        double area = ladoMaior * ladoMenor;
        System.out.println("A área do retangulo é: " + area);
        return area;
    }

    public static void area(double base, double topo, double altura){
        double area = ((base + topo) * altura) / 2;
        System.out.println("A área do trapézio é: " + area);
    }

    public static void area(float diagonal1, float diagonal2){
        float area = ((diagonal1 * diagonal2) / 2);
        System.out.println("A área do losango é: " + area);
    }

}
