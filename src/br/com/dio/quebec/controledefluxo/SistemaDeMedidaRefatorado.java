package br.com.dio.quebec.controledefluxo;

public class SistemaDeMedidaRefatorado {
    public static void main(String[] args) {
        String sigla = "P";

        // Refatorado por função igual o ResultadoEscolarRefatorado.java
        /*String medida = sigla=="P" ? "PEQUENO" : sigla=="M" ? "MEDIO" : sigla=="G" ? "GRANDE" : "INDEFINIDO";
        System.out.println(medida);*/

        // Refatorado por Switch Case
        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            } case "M":{
                System.out.println("MEDIO");
                break;
            } case "G":{
                System.out.println("GRANDE");
                break;
            } default:
                System.out.println("INDEFINIDO");
        }

    }
}
