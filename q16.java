package Anexo_9;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        float maior = -Float.MAX_VALUE, media_filhos, media_salario, salario, armazen_sal = 0;
        int filhos, opcao, populacao = 0, qtd_filhos = 0, renda_mil = 0;

        Scanner scan = new Scanner(System.in);

        do {
            populacao++;

            System.out.print("Insira o salário do habitante: ");
            salario = scan.nextFloat();
            armazen_sal += salario;

            if ( salario > maior ) {
                maior = salario;
            }

            if ( salario <= 1000 ) {
                renda_mil++;
            }

            System.out.print("Insira a quantidade de filhos: ");
            filhos = scan.nextInt();
            qtd_filhos += filhos;

            do {
                System.out.print("O que deseja fazer?\n1. Adicionar habitante.\n0. Gerar estatística final.\nOpção: ");
                opcao = scan.nextInt();
            } while ( opcao < 0 || opcao > 1 );

        } while ( opcao == 1 );

        media_salario = armazen_sal / populacao;
        media_filhos = (float) qtd_filhos / populacao;

        System.out.printf("\nMédia salarial: R$ %.2f\n", media_salario);
        System.out.printf("Média de filhos: %.2f\n", media_filhos);
        System.out.printf("Maior salário: R$ %.2f\n", maior);
        System.out.println("Salários até R$ 1000,00:\n" + renda_mil);
    }
}