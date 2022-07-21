package Loops_e_Arrays;
/*
Faça um programa que calcule o fatoria de um número inteiro fornecido pelo usuário
 */

import java.util.Scanner;

public class Ex6_Fatorial_java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;

        }
        System.out.println(multiplicacao);
    }
}
