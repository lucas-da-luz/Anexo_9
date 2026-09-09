package Anexo_9;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int armazenador = 1;

        System.out.print("Insira o número a ser fatorial");
        int fatorial = scan.nextInt();
        System.out.println(fatorial + "! =");

        for (; fatorial > 0; fatorial --){
            if ( fatorial != 1){
                System.out.print(fatorial+"x");
                armazenador *= fatorial;
            } else {
                armazenador *= fatorial;
                System.out.print(fatorial + " = " + armazenador);
            }
        }
    }
}
