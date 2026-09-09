package Anexo_9;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, somaPositivos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Insira o " + i + "º valor: ");
            numero = scan.nextInt();

            if (numero > 0 ) {
                somaPositivos += numero;
            }
        }

        System.out.println("Resultado: " + somaPositivos);

        scan.close();
    }
}