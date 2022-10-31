package Aulas.poo;

public class Pet {
    private String nome;
    private int idade;
    protected double peso;
    // nas subclasses o atributo/metodo private
    // não é acessível
    // protected => permite acesso direto nas subclasses
    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom() {
        System.out.println("");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void dormir() {
        System.out.println("zzzzzzzzzzzzzzz");
    }

    public void brincar() {
        System.out.println("Estou brincando... ");
    }

    public double getPeso() { // apenas leitura de peso
        return this.peso;
    }

    public void setPeso(double novoPeso) { // possibilidade de alterar o peso
        this.peso = novoPeso;
    }
}
