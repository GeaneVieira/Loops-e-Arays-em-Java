package Loops_e_Arrays;

import java.util.Random;

/*
Fça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
Armazene-os em um vetor e ao final mostre os seus números sucessores.
 */
public class Arrays_Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;

        }

        System.out.print("Números Aleatórios: ");
        for ( int numero : numAleatorios) {
            System.out.print(numero + " " );
        }

        System.out.print("\nSucessore dos Números Aleatórios: ");
        for ( int numero : numAleatorios) {
            System.out.print((numero + 1) + " ");
        }


    }
}
