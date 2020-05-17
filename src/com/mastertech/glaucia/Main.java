package com.mastertech.glaucia;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o capital a ser investido R$: ");

        double valor = sc.nextDouble();

        System.out.print("Digite o prazo: ");

        int  meses = sc.nextInt();

        //double resul = meses*(valor*1.007);


        double resul=valor;

        for (int tempo=1; tempo<=meses; ++tempo){
            resul +=(0.007*resul);
        }

        System.out.printf("\n========================================\n");

        System.out.print("Resultado R$ " + df2.format(resul));

        System.out.printf("\n========================================\n");





    }
}
