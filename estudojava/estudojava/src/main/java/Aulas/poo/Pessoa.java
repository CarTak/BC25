package Aulas.poo;

public class Pessoa {
    // Propriedades /atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa() { // construtor da classe
        // this => representa o objeto
        this.nome = "João";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }

    Pessoa(String nome,String sobrenome,int idade,double altura,double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    Pessoa(String nome,String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 1.5;
        this.peso = 2.0;
    }
    // Ações de uma pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo(PARAMETRO) {}
    void dizOla() { // método
        System.out.println("Olá, tudo bem? " + this.nome);
    }
    void mostrarImc() {
//      double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("O meu IMC é " + imc);
    }
    double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }
}
