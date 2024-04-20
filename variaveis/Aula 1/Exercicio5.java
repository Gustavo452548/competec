// 1. Receba um input numérico e imprima VERDADEIRO se ele for múltiplo de 3 OU de 5, caso contrário, imprima FALSO.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️

        int numero;

        Scanner cleitu = new Scanner(System.in);

        System.out.println("Verifique se é multiplo de 3 ou 5");
       
        System.out.println("digite seu número");
        numero = cleitu.nextInt();

        if (numero % 3 == 0 || numero % 5 == 0){
            System.out.println("VERDADEIRO");
            System.out.println("número multiplo de 3 ou de 5");    
        }
        else{
            System.out.println("FALSO");
            System.out.println("O número não é multiplo nem de 3 e nem de 5");
        }

    }
}
