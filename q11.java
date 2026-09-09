package Anexo_9;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        float soma = 0, numero;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Insira o número desejado: ");
            numero = scan.nextFloat();
            soma += numero;

        } while ( numero != 0 );

        System.out.printf("Sua soma é de: %.2f", soma);
    }
}