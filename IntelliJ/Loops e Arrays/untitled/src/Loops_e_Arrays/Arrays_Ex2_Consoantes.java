package Loops_e_Arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracters,
e diga quantas consoantes foram lidas.
Imprima as consoantes
 */
public class Arrays_Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qts_consoantes = 0;

        int cont = 0;

        do {
            System.out.println("Letra");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){

                consoantes[cont] = letra;
                qts_consoantes++;
            }
            cont++;


        }while (cont < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) {
            if( consoante != null)
                System.out.print( consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " + qts_consoantes);
        System.out.println(consoantes.length);

    }
}
