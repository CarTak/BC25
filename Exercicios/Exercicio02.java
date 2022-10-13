import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para fazer conversão de Reais para Dólar \n\n");
        System.out.println("Insira o valor de câmbio do Dólar de hoje: ");
        double dolar = entrada.nextFloat();
        System.out.println("Insira o valor em dólares que você deseja converter: ");
        double qtdDolar = entrada.nextFloat();
        double valorDolar = dolar * qtdDolar;
        System.out.println("O valor é de R$ " + valorDolar);

    }
}
