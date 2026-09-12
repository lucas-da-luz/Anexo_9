package Anexo_9;

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        float media_geral, media_impares, media_pares, soma_geral = 0, soma_impares = 0, soma_pares = 0;
        int numero, qtd_geral = 0, qtd_impares = 0, qtd_pares = 0;

        Scanner scan = new Scanner(System.in);

        do {
            do {
                System.out.print("Insira um número positivo (0 para encerrar): ");
                numero = scan.nextInt();
            } while ( numero < 0 );

            if ( numero != 0 ) {
                qtd_geral++;
                soma_geral += numero;

                if ( numero % 2 == 0 ) {
                    qtd_pares++;
                    soma_pares += numero;
                } else {
                    qtd_impares++;
                    soma_impares += numero;
                }
            }

        } while ( numero != 0 );

        
        if ( qtd_geral > 0 ) {
            media_geral = soma_geral / qtd_geral;

            System.out.println("\nEstatísticas:");
            System.out.println("Quantidade de números pares: " + qtd_pares);
            System.out.println("Quantidade de números ímpares: " + qtd_impares);

            if ( qtd_pares > 0 ) {
                media_pares = soma_pares / qtd_pares;
                System.out.printf("Média dos valores pares: %.2f\n", media_pares);
            } else {
                System.out.println("Nenhum número par foi inserido.");
            }

            if ( qtd_impares > 0 ) {
                media_impares = soma_impares / qtd_impares;
                System.out.printf("Média dos valores ímpares: %.2f\n", media_impares);
            } else {
                System.out.println("Nenhum número ímpar foi inserido.");
            }

            System.out.printf("Média geral dos números: %.2f\n", media_geral);
        } else {
            System.out.println("\nNenhum número foi digitado.");
        }
    }
}