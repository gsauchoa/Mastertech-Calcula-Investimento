package com.mastertech.glaucia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorConsole {
    public Scanner scanner;

    public LeitorConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: "+sc.next());
        sc.close();
    }
}
