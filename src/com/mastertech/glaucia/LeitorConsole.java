package com.mastertech.glaucia;

import java.util.Scanner;

public class LeitorConsole {
    double valor;
    int meses;
    public LeitorConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o capital a ser investido R$: ");
          valor = sc.nextDouble();
        System.out.print("Digite o prazo: ");
           meses = sc.nextInt();
    }

    public double getValor() {
        return valor;
    }

    public int getMeses() {
        return meses;
    }
}
