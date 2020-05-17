package com.mastertech.glaucia;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

       LeitorConsole Leitor = new LeitorConsole();

       double valor= Leitor.valor;

       int meses=Leitor.meses;

        CalculaInvestimento calcular = new CalculaInvestimento();

        double resul=calcular.CalculaInvestimento(valor, meses);

        System.out.printf("\n========================================\n");

        System.out.print("Resultado R$ " + df2.format(resul));

        System.out.printf("\n========================================\n");





    }
}