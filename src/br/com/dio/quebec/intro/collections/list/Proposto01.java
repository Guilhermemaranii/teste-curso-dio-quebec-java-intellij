package br.com.dio.quebec.intro.collections.list;

import java.util.ArrayList;
import java.util.List;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Proposto01 {
    public static void main(String[] args) {

        List<Meses> meusMeses = new ArrayList<>(){{
            add(new Meses(1, "Janeiro", 25.4d));
            add(new Meses(2, "Fevereiro", 29.6d));
            add(new Meses(3, "Março", 27.6d));
            add(new Meses(4, "Abril", 19.0d));
            add(new Meses(5, "Maio", 20.2d));
            add(new Meses(6, "Junho", 18.3d));
        }};

        System.out.println(meusMeses);

    }

    static class Meses {
        public Integer numeroMes;
        public String nomeMes;
        public Double temperaturaMes;

        public Meses(Integer numeroMes, String nomeMes, Double temperaturaMes) {
            this.numeroMes = numeroMes;
            this.nomeMes = nomeMes;
            this.temperaturaMes = temperaturaMes;
        }

        public Integer getNumeroMes() {
            return numeroMes;
        }

        public String getNomeMes() {
            return nomeMes;
        }

        public Double getTemperaturaMes() {
            return temperaturaMes;
        }

        @Override
        public String toString() {
            return "Meses{" +
                    "numeroMes=" + numeroMes +
                    ", nomeMes='" + nomeMes + '\'' +
                    ", temperaturaMes=" + temperaturaMes +
                    '}';
        }
    }
}