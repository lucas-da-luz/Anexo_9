package Anexo_9;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número (1 a 10): ");
        n = scan.nextInt();

        for ( int i = 0; i <= 10; i++ ) {
            System.out.println(i + " x " + n + " = " + ( i * n ));
        }
    }
}