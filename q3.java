package Anexo_9;

public class q3 {
    static void main(String[] args) {
        int mil = 1000, contador, negativos = 0;
        do {
            contador = (mil % 11);
            if (contador == 5){
                negativos++;
            }
            mil++;
        } while (mil < 2000);
        System.out.printf("Os números negativos possíveis são: %d", negativos);
    }
}