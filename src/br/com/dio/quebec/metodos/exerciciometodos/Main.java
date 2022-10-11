package br.com.dio.quebec.metodos.exerciciometodos;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio calculadora");
        CalculadoraProf.soma(3, 6);
        CalculadoraProf.subtrair(9, 1.8);
        CalculadoraProf.multiplicar(7, 8);
        CalculadoraProf.dividir(5, 2.5);

        // Mensagem
        System.out.println("Exercicio calculadora");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Emprestimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);

    }
}
