package br.com.dio.quebec.controledefluxo;

public class PlanoOperadora {
    public static void main(String[] args) {

        // Minha tentativa de codar o exemplo
        /*String plano = "BASIC";
        switch (plano) {
            case "BASIC": {
                System.out.println("100 minutos");
                break;
            }
            case "MIDIA": {
                System.out.println("100 minutos + Whatsapp e Instagram grátis");
                break;
            }
            case "TURBO": {
                System.out.println("100 minutos + Whatsapp e Instagram grátis + 5GB no Youtube");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }*/

        // Resolução do professor

        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5GB no Youtube");
            } case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            } case "B": {
                System.out.println("100 minutos");
            }
        }
    }

}
