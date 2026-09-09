package Anexo_9;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        float altura, maior, menor;

        Scanner scan = new Scanner(System.in);
        // Poderia se utilizar o Float.Min/Max_Value nas variáveis, mas por ser a primeira vez que
        // vi, deixa como tá e em outro eu utilizo, para lembrete
        System.out.print("Insira a altura da 1ª pessoa: ");
        altura = scan.nextFloat();
        menor = altura;
        maior = altura;

        for ( int contador = 2; contador <= 15; contador++ ) {
            System.out.print("Insira a altura da " + contador + "ª pessoa: ");
            altura = scan.nextFloat();

            if ( altura < menor ) {
                menor = altura;
            }
            if ( altura > maior ) {
                maior = altura;
            }
        }

        System.out.printf("A menor altura do grupo é: %.2f\n", menor);
        System.out.printf("A maior altura do grupo é: %.2f\n", maior);
    }
}