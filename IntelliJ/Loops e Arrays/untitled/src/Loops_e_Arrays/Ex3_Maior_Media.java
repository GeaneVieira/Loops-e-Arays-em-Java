package Loops_e_Arrays;
/* Faça um programa que leia 5 números
e informe o maior número
e a média desses números
 */

import java.util.Scanner;

public class Ex3_Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;

        int cont = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            cont = cont + 1;
        }while (cont < 5);
        System.out.println("maior número é: " + maior);
        System.out.println("Média = " + soma);

    }
}
