package Anexo_9;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo = "", sex = "";

        do {

            System.out.print("Insira o seu sexo: ");
            sexo = scan.nextLine().trim();

            if (sexo.equalsIgnoreCase("F")) {
                sex = "Feminine";
            } else if (sexo.equalsIgnoreCase("M")) {
                sex = "Masculine";
            } else if (sexo.equalsIgnoreCase("I")) {
                sex = "Indeferido";
            } else{
                System.out.print("Opção inválida! Digite apenas F, M, I.\n");
            }
        } while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("I"));

        System.out.printf(sex);
    }
}