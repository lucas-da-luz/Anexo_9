package Anexo_9;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira numero: ");
            numero = scan.nextInt();
            soma += numero;
        }

        System.out.println("Sua soma é: " + soma);
    }
}
