package Exercicios;
//2) Crie um hierarquia de classes:
//
//        Classe Funcionario:
//        * Atributos: nome, salario, idade;
//        * Construtores: Cria funcionários com base no nome, salario, idade;
//        * Métodos:
//        - getSalario();
//        - getSalarioAnual();
//        - aumentarSalario(double acrescimo);
//        - reduzirSalario(double reducao);
//
//        Classe Gerente -> Funcionario:
//        * Atributos: bonus;
//        * Construtores: Cria Gerente com base no bonus e nos parâmetros do construtor de Funcionario.
//        * Métodos:
//        - @Override getSalario() => calcula o salario com base no bonus

public class func {
    private String nome;
    private double salario;
    private double idade;

    public func(String nome, double salario, double idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
