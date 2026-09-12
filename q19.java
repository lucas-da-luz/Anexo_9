package Anexo_9;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        String sexo;
        float media_salario, salario, soma_salario = 0;
        int idade, maior_idade = Integer.MIN_VALUE, menor_idade = Integer.MAX_VALUE, opcao, populacao = 0, qtd_homens_2k = 0;

        Scanner scan = new Scanner(System.in);

        do {
            populacao++;

            do {
                System.out.print("Insira a idade: ");
                idade = scan.nextInt();
            } while ( idade < 0 );

            if ( idade > maior_idade ) {
                maior_idade = idade;
            }

            if ( idade < menor_idade ) {
                menor_idade = idade;
            }

            do {
                System.out.println("Sexo (M - Masculino | F - Feminino)");
                sexo = scan.next().toUpperCase();
            } while ( !sexo.equals("M") && !sexo.equals("F") );

            do {
                System.out.print("Insira o salário: ");
                salario = scan.nextFloat();
            } while ( salario < 0 );

            soma_salario += salario;

            if ( sexo.equals("M") && salario <= 2000 ) {
                qtd_homens_2k++;
            }

            do {
                System.out.print("Deseja cadastrar outro habitante?\n1. Sim\n0. Não\nOpção: ");
                opcao = scan.nextInt();
            } while ( opcao < 0 || opcao > 1 );

        } while ( opcao == 1 );

        media_salario = soma_salario / populacao;

        System.out.println("\nEstatísticas do grupo:");
        System.out.printf("Média salarial: R$ %.2f\n", media_salario);
        System.out.println("Maior idade: " + maior_idade);
        System.out.println("Menor idade: " + menor_idade);
        System.out.println("Homens com salário até R$ 2000,00: " + qtd_homens_2k);
    }
}