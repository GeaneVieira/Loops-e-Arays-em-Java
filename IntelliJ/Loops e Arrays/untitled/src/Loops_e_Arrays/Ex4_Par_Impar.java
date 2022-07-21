package Loops_e_Arrays;
/*
Faça u progrma que peça N números inteiros,
Calcuçe e mostre a quantidade de números pares
e a quantidade de números impares.
 */

import java.util.Scanner;

public class Ex4_Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtd_pares = 0;
        int qtd_impares = 0;


        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int cont = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) qtd_pares++;
            else qtd_impares++;

            cont = cont + 1;

        } while(cont < qtdNumeros);

        System.out.println("Quantidade de números pares: " + qtd_pares);
        System.out.println("Quantidade de números impares: " + qtd_impares);

    }
}
