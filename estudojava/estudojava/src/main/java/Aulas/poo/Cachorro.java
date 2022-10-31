package Aulas.poo;
// Cachorro é a sub-classe/classe filha
// para poder usar a classe do classe pai é necessário usar extends Pet(Nome da classe pai)
public class Cachorro extends Pet {
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso,String comidaFavorita, String raca) {
        // representa a classe Pet
        super(nome, idade, peso); // chamando o constructor da classe pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override //  @Override => anotação = vamos sobrecrever a ação de fazer som
    public void fazerSom() {
        System.out.println("Au auuuu");
    }

    @Override
    public void brincar() { // o cachorro late na hora de brincar
        this.fazerSom(); // um método pode chamar outro
        super.brincar(); // está chamando o brincar() Pet
        this.dormir(); // com o this ele vai chamar o dormir do Pet porque ele não foi subrescrito
    }

    @Override
    public void comer(String comida) {
        // verifica se é comida favorita
        if (comida.equals(this.comidaFavorita)) { // o equals neste caso é usado para se comparar strings
            super.comer(comida); // chama o comer() do Pet
            //o acesso é permitido porque peso é protected no Pet (Protected permite somente acesso das Classes subclasses)
            // Com protected a subclasse pode fazer alterações sem o uso de Setters
            this.peso += 0.2;
            // this.setPeso(this.getPeso() + 0.2); // Se não protected ele terá que usar Setter
        } else {
            System.out.println("Quero " + comida + " não!");
        }
    }

    public void correrAtrasMoto() { // método específico do cachorro
        this.fazerSom();
        System.out.println("Correndo atrás da moto");
    }

    public static void main(String[] args) {
        // Testar a herança
        // Pet é a Classe pai
        Pet pet1 = new Pet("Fred",3,12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println("=================");

        //Cachorro é uma sub-classe
        Cachorro batata = new Cachorro("Rex",5,25,"Osso","Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("Osso");
    }
}
