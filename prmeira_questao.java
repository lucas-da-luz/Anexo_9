package Anexo_9;

public class first {
    static void main(String[] args) {
        float juca = 1.10F;
        float chico = 1.50F;
        int anos = 0;

        do {
            juca += 0.03F;
            chico += 0.02F;
            anos ++;
        } while (juca <= chico);

        System.out.printf("Serão necessários %d anos para Juca ser maior que Chico.", anos);
    }
}
