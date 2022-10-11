package br.com.dio.quebec.metodos.exerciciosobrecarga;

public class CalculoQuadrilateroReturn {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double ladoMaior, double ladoMenor){
        return ladoMaior * ladoMenor;
    }

    public static double area(double base, double topo, double altura){
        return ((base + topo) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2){
        return ((diagonal1 * diagonal2) / 2);
    }

}
