package Anexo_9;

import java.util.Scanner;

public class q2 {
    static void main(String[] args) {
        float A;
        int vezes = 0, contador = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.printf("Insira o número: ");
            A = scan.nextFloat();
                if (A < 0) {
                    contador ++;
                }
            vezes ++;
        } while (vezes != 5);

        System.out.printf("Os números negativos são: %d", contador);
    }
}
