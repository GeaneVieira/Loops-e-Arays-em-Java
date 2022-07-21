package Loops_e_Arrays;
/*
Crie um vetir de 6 número inteiros
e mostre na ordem inversa.
 */
public class Arrays_Ex1_Ordem_Inversa {
    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int cont = 0;
        while(cont < (vetor.length)){
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }

    }

}
