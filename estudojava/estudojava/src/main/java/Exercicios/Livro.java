package Exercicios;

// 4) Crie uma classe Livro que possui:
//        Atributos: nome, autor, preco;
//        Construtores:
//        - Cria livros com base nos parâmetros nome, autor (objeto da classe Autor), preco;

public class Livro {
    private String nome;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, Double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
