import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular o estoque médio");
        System.out.println("Insira a quantidade mínima de estoque");
        double qtdminimo = entrada.nextFloat();
        System.out.println("Insira a quantidade máxima de estoque");
        double qtdmaximo = entrada.nextFloat();
        double media = (qtdminimo + qtdmaximo) / 2 ;
        System.out.println("O estoque médio é " + media);

    }
}
