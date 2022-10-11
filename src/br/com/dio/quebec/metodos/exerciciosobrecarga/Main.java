package br.com.dio.quebec.metodos.exerciciosobrecarga;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercício Quadrilátero");

        double areaQuadrado = CalculoQuadrilateroReturn.area(3);
        System.out.println("a area do quadrado e " + areaQuadrado);

        double areaRetangulo = CalculoQuadrilateroReturn.area(5d, 5d);
        System.out.println("A área do retangulo é: " + areaRetangulo);

        double areaTrapezio= CalculoQuadrilateroReturn.area(7, 8, 9);
        System.out.println("A área do trapézio é " + areaTrapezio);

        double areaLozango = CalculoQuadrilateroReturn.area(5F, 5F);
        System.out.println("A área do lozango é: " + areaLozango);

    }
}
