package br.com.dio.quebec.repeticao.exemplofor;
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            DecimalFormat formatador = new DecimalFormat("0.00");

            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: R$" + formatador.format(valorDoce) + " Adicionado no carrinho," + " Mesada restante: R$" + formatador.format(mesada));
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
