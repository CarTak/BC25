package Aulas.correcao;

import java.util.Scanner;

/*
3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
que V1 e V2 possuem valores idênticos nas mesmas posições
 */
public class Correcao3 {
    public static void main(String[] args) {
        // Entrada dos dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho]; // vetor tem SEMPRE o tamanho especificado pelo usuario
        int[] v2 = new int[tamanho];

        System.out.println("Digite os valores de v1: ");
        for(int i = 0; i < tamanho; i++){ //0,1,2,3 .. tamanho -1
            v1[1] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2: ");
        for(int i = 0; i < tamanho; i++){
             v2[1] = entrada.nextInt();
        }

        //Processamento de dados
        // v1 = [1 , 2, 3] e v2 = [1 , 3, 2] => Foram 1 encontro(s)
        int encontros = 0; //quantas vezes são iguais
        for(int i = 0; i < tamanho; i++) {
            if(v1[i] == v2[i]) {
                encontros++;
            }
        }

        // Saida
        System.out.println("Foram " + encontros + " encontro(s)");
    }
}
