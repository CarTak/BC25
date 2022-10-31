package Aulas.poo.escola;

public class Aluno extends Pessoa{
    private double media;
    // chamada do super deve sempre vir primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); // estou chamndo um construtor de Pessoa
        this.media = media;
    }

    @Override
    public void seApresentar() { //na subescrita mudamos o comportamento (apenas)
        super.seApresentar(); // super = Pessoa
        System.out.println("Eu sou um aluno com média : " + this.media);
    }

    public double getMedia() {
        return this.media;
    }
}
