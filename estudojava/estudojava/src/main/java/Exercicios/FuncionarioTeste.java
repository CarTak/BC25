package Exercicios;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do aumento: ");
        double aumento = entrada.nextDouble();


        Funcionario funcionario1 = new Funcionario("José","João",2000);
        double novoSalario = aumento + funcionario1.getSalario();
        funcionario1.setSalario(novoSalario);
        double salarioAnual = novoSalario * 12;

        System.out.println("O salario anual de " + funcionario1.getnomeCompleto() + " é de " + salarioAnual);
        System.out.println("O novo salario com o aumento é :  " + novoSalario );
    }
}
