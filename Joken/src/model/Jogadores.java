package model;

import java.util.Scanner;

public class Jogadores {
    //Pc 
    public static int valorEscolhidoPc;
    public static int escolhaDoPC(){
        int n = (int) (java.lang.Math.random() * 5 + 1);
        System.out.println("Pc escolheu: " + n);
        return valorEscolhidoPc = n;
    }
    //Player
    public static int valorEscolhidoPlayer;
    public static int escolhaPlayer(){
        int escolhaNmr;
        System.out.println("Escolha Número");
        Scanner in = new Scanner(System.in);
        escolhaNmr = in.nextInt();

       if(escolhaNmr > 5){
           System.out.println("Numero nao existe");
       }else if(escolhaNmr < 1){
           System.out.println("Numero nao existe");
       }else{
           System.out.println("Player escolheu: " + escolhaNmr);
       }
        in.close();
        return valorEscolhidoPlayer = escolhaNmr;
    }

}
