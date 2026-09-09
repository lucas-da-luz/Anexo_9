package Anexo_9;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        float pares = 0, soma = 0, numero;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("insira o numero desejado: ");
            numero = scan.nextFloat();
            if ((numero % 2) == 0){
                soma += numero;
                pares ++;
            }
        } while (numero != 0);

        float media = soma / pares;

        System.out.printf("Sua média é de: %.2f", media);
    }
}
