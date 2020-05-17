package com.mastertech.glaucia;
import java.io.PrintStream;
import java.text.DecimalFormat;

public class Impressora {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public Impressora(double valor) {

        System.out.print("\n========================================\n");

        System.out.print("Resultado R$ " + df2.format(valor));

        System.out.print("\n========================================\n");
    }
}