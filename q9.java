package Anexo_9;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, armazen = 0;
        String operacao = "";

        System.out.print("Insira o número inicial: ");
        armazen = scan.nextDouble();
        scan.nextLine();

        do {
            do {
                System.out.print("Insira a operação (+, -, *, /) ou 'S' para sair: ");
                operacao = scan.nextLine().trim();

                if (!operacao.equals("+") && !operacao.equals("-")
                    && !operacao.equals("*") && !operacao.equals("/")
                    && !operacao.equalsIgnoreCase("S") ) {

                        System.out.println("Opção inválida! Digite apenas +, -, *, / ou S.");

                }
            } while (!operacao.equals("+") && !operacao.equals("-")
                     && !operacao.equals("*") && !operacao.equals("/")
                     && !operacao.equalsIgnoreCase("S") );

            if (operacao.equalsIgnoreCase("S") ) {
                break;
            }

            System.out.print("Insira o próximo número: ");
            a = scan.nextDouble();
            scan.nextLine();

            if (operacao.equals("+")) {
                armazen += a;
            } else if (operacao.equals("-") ) {
                armazen -= a;
            } else if (operacao.equals("*") ) {
                armazen *= a;
            } else if (operacao.equals("/") ) {
                if (a != 0) {
                    armazen /= a;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
            }

            System.out.println("Resultado: " + armazen);

        } while (!operacao.equalsIgnoreCase("S"));

        System.out.println("Resultado: " + armazen);

        scan.close();
    }
}