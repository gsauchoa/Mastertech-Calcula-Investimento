package com.mastertech.glaucia;
public class CalculaInvestimento {
    public double CalculaInvestimento( double valor, int meses) {
        double resul = valor;
        for (int tempo = 1; tempo <= meses; ++tempo) {
            resul += (0.007 * resul);
        }
        return resul;
        }
    }
