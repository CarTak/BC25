package Aulas.correcao;
/*
5) Criar programa java que lê N e depois N valores armazenado no array,
   em seguida retorna a soma total e a média dos valores.
 */

import java.util.Scanner;

public class Correcao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tamanho do array?");
        int tamanhoArray = entrada.nextInt();
        double soma = 0, media = 0;

        double[] valores = new double[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++){
            System.out.println("Valor " + (i+1) + ":");
            valores [i] = entrada.nextDouble();
            soma += valores[i];
        }
        media = soma / tamanhoArray;

        System.out.println("A soma de todos os valores é: " + soma + " e a media é: " + media);
    }
}
