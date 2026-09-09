package Anexo_9;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        double media = 0, numero, soma = 0;
        int negativos = 0, positivos = 0, total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Insira um número: ");
            numero = scan.nextDouble();

            if ( numero != 0 ) {
                soma += numero;
                total++;

                if ( numero > 0 ) {
                    positivos++;
                } else {
                    negativos++;
                }
            }

        } while ( numero != 0 );

        if ( total > 0 ) {
            media = soma / total;

            System.out.printf("Média: %.2f\n", media);
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
        }
    }
}