package com.mastertech.glaucia;


public class Main {

    public static void main(String[] args) {

       LeitorConsole Leitor = new LeitorConsole();

       double valor= Leitor.valor;

       int meses=Leitor.meses;

        CalculaInvestimento calcular = new CalculaInvestimento();

        double resul=calcular.CalculaInvestimento(valor, meses);

        Impressora impressora = new Impressora(resul);

    }
}