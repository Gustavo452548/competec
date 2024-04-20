// 1. Compare o seu nome com o nome do colega ao lado e veja se são iguais
// 2. Faça uma comparação para descobrir se você é mais novo que o professor;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Ex.1 ⬇️
       string nome1 = "Gabriel";
       string nome2 = "Gustavo";

       if (nome1.equal(nome2)){ 
            System.out.println("os nomes são iguais");
       }
       else{
            System.out.println("os nomes são diferentes");
       }

       // Ex.2
       
       int idade1, idade2;
    
       Scanner cleitu = new Scanner(System.in);
       
       System.out.println("digite a idade do professora");
       idade1 = cleitu.nextint();

       System.out.println("digite a idade d aluno");
       idade2 = cleitu.nextInt();

       boolean comparacao = idade1 > idade2;

      System.out.println(comparacao);
    
    }
}
