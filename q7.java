package Anexo_9;
public class q7 {
    public static void main(String[] args){

        int soma = 0;

        for (int numero = 1; numero < 501; numero++  ){
            if (numero % 2 != 0 && numero % 3 == 0){
               soma += numero;
            }
        }
        System.out.print(soma);
    }
}
