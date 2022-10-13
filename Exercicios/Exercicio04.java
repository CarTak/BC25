import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para mostrar propriedade distributiva \n\n");
        System.out.println("Informe o valor do 1° número: ");
        int num1 = entrada.nextInt();
        System.out.println("Informe o valor do 2° número: ");
        int num2 = entrada.nextInt();
        System.out.println("Informe o valor do 3° número: ");
        int num3 = entrada.nextInt();
        System.out.println("Informe o valor do 4° número: ");
        int num4 = entrada.nextInt();
        int cont1 = num1 * num2;
        int cont2 = num1 * num3;
        int cont3 = num1 * num4;
        int cont4 = num2 * num3;
        int cont5 = num2 * num4;
        int cont6 = num3 * num4;
        int cont7 = num1 + num2;
        int cont8 = num1 + num3;
        int cont9 = num1 + num4;
        int cont10 = num2 + num3;
        int cont11 = num2 + num4;
        int cont12 = num3 + num4;
        System.out.println("Distributiva na Multiplicação");
        System.out.println("a * b = " + cont1 + ", a * c = " + cont2 + ", a * d = " + cont3 + ", b * c = " + cont4 + ", b * d = " + cont5 + ", c * d = " + cont6);
        System.out.println("Distributiva na Soma");
        System.out.println("a + b = " + cont7 + ", a + c = " + cont8 + ", a + d = " + cont9 + ", b + c = " + cont10 + ", b + d = " + cont11 + ", c + d = " + cont12);
    }
}

