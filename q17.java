package Anexo_9;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        float perc_c1, perc_c2, perc_c3, perc_c4, perc_nulo;
        int branco = 0, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, nulo = 0, total = 0, voto;

        Scanner scan = new Scanner(System.in);

        do {
            do {
                System.out.print("Voto (1-4: Candidatos | 5: Nulo | 6: Branco | 0: Confirmar | 7: Encerrar): ");
                voto = scan.nextInt();
            } while ( voto < 0 || voto > 7 );

            switch ( voto ) {
                case 1:
                    cand1++;
                    total++;
                    break;

                case 2:
                    cand2++;
                    total++;
                    break;

                case 3:
                    cand3++;
                    total++;
                    break;

                case 4:
                    cand4++;
                    total++;
                    break;

                case 5:
                    nulo++;
                    total++;
                    break;

                case 6:
                    branco++;
                    total++;
                    break;

                case 0:
                    break;
            }

        } while ( voto != 7 );

        System.out.println("\nResultado:");
        System.out.println("Candidato 1: " + cand1);
        System.out.println("Candidato 2: " + cand2);
        System.out.println("Candidato 3: " + cand3);
        System.out.println("Candidato 4: " + cand4);
        System.out.println("Nulos: " + nulo);
        System.out.println("Brancos: " + branco);
        System.out.println("Total: " + total);

        // O (float) realiza a conversão explícita (casting) para evitar a divisão
        // inteira, garantindo que o resultado preserve as casas decimais.
        if ( total > 0 ) {
            perc_c1 = ( (float) cand1 / total ) * 100;
            perc_c2 = ( (float) cand2 / total ) * 100;
            perc_c3 = ( (float) cand3 / total ) * 100;
            perc_c4 = ( (float) cand4 / total ) * 100;
            perc_nulo = ( (float) nulo / total ) * 100;

            System.out.println("\nPercentual dos votos (1 a 5):");
            System.out.printf("Candidato 1: %.2f%%\n", perc_c1);
            System.out.printf("Candidato 2: %.2f%%\n", perc_c2);
            System.out.printf("Candidato 3: %.2f%%\n", perc_c3);
            System.out.printf("Candidato 4: %.2f%%\n", perc_c4);
            System.out.printf("Nulos: %.2f%%\n", perc_nulo);
        }
    }
}