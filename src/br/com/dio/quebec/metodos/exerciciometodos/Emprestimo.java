package br.com.dio.quebec.metodos.exerciciometodos;

public class Emprestimo {

    public static int getDuasParcelas(){
       return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.54;
    }

    public static void calcular(double valor, int parcelas){

        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para duas parcelas é de R$ " + valorFinal);
    } else if(parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para três parcelas é de R$ " + valorFinal);
        } else{
            System.out.println("Quantidade de parcelas não aceita");
        }

    }
}