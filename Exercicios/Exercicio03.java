import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular comissão de vendas \n\n");
        System.out.println("Informe o nome do vendedor: ");
        String nome = entrada.nextLine();
        System.out.println("Informe o codigo da peça: ");
        String codigo = entrada.nextLine();
        System.out.println("Informe o preço unitário da peça: ");
        double preco = entrada.nextFloat();
        System.out.println("Informe a quantidade vendida: ");
        int quantidade = entrada.nextInt();
        double comissao = (preco * quantidade) * 0.05;
        System.out.println("A comissão do vendedor " + nome + " com a venda do produto " + codigo + " é de R$ " + comissao);
    }
}
