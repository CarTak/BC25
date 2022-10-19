package Exercicios;

// 2) Crie uma classe Empregado que possui:
//        Atributos: nome, sobrenome, salario
//        Construtores:
//       - Cria empregados com base nos parâmetros nome, sobrenome e salario;
//        Métodos:
//        - calcularSalarioAnual() => deve retornar double
//        - aumentarSalario(double aumento) => aumenta o valor do salário
//        - nomeCompleto() => deve retornar a concatenação do nome e sobrenome

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;

    Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getnomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
