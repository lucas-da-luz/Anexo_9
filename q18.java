package Anexo_9;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {

        int idade, maior_idade = -1, opcao, qtd_especifica = 0;
        String cabelo, olhos, sexo;

        Scanner scan = new Scanner(System.in);

        do {
            do {
                System.out.print("Insira a idade: ");
                idade = scan.nextInt();
            } while ( idade < 0 );

            if ( idade > maior_idade ) {
                maior_idade = idade;
            }

            do {
                System.out.print("Sexo (M - Masculino | F - Feminino): ");
                sexo = scan.next().toUpperCase();
            } while ( !sexo.equals("M") && !sexo.equals("F") );

            do {
                System.out.print("Olhos (A - Azuis | V - Verdes | C - Castanhos): ");
                olhos = scan.next().toUpperCase();
            } while ( !olhos.equals("A") && !olhos.equals("V") && !olhos.equals("C") );

            do {
                System.out.print("Cabelos (L - Louros | C - Castanhos | P - Pretos): ");
                cabelo = scan.next().toUpperCase();
            } while ( !cabelo.equals("L") && !cabelo.equals("C") && !cabelo.equals("P") );

            if ( sexo.equals("F") && idade >= 18 && idade <= 35 && olhos.equals("V") && cabelo.equals("L") ) {
                qtd_especifica++;
            }

            do {
                System.out.print("Deseja cadastrar outro habitante?\n1. Sim\n0. Não\nOpção: ");
                opcao = scan.nextInt();
            } while ( opcao < 0 || opcao > 1 );

        } while ( opcao == 1 );

        System.out.println("\nEstatísticas:");
        System.out.println("Maior idade: " + maior_idade);
        System.out.println("Mulheres entre 18 e 35 anos, olhos verdes e cabelos louros: " + qtd_especifica);
    }
}