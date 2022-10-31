package Exercicios;

import java.util.Scanner;

public class funcTeste extends func{
    private String cargo;

    public funcTeste(String nome, double salario, double idade,String cargo){
        super(nome,salario,idade);
        this.cargo = cargo;
    }
    Scanner entrada = new Scanner(System.in);
//    System.out.println("Digite o valor do bônus: ");
    String bonus = entrada.nextLine();



}
