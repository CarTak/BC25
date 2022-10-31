package Exercicios;

import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Livro: ");
        String nomeLivro = entrada.nextLine();
        System.out.println("Digite o nome do Autor Livro: ");
        String nomeAutor = entrada.nextLine();
        System.out.println("Digite o preço do Livro: ");
        double nomePreco = entrada.nextDouble();
    }
}
