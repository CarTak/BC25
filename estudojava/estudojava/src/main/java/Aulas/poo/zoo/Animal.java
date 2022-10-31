package Aulas.poo.zoo;

// Na interface você define um conjunto de métodos (sem corpo)
// E a classe que "herda" deve implementar estes métodos
public interface Animal {
    void dormir(); //definição do metodo apenas
    void fazerSom();
    void comer(String comida);
}
// Gato precisa implementar os métodos
class Gato implements Animal{
    @Override
    public void dormir() {
        System.out.println("zzzzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if(comida.equals("Peixe")) {
            System.out.println("Hum gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }

    public void ronronar(){
        System.out.println("rrrrrrrr");
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("có zzzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummm có có " + comida);
    }
    public void botarOvo() {
        System.out.println("Botar ovo");
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");
        galinha.botarOvo();

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");
        gato.ronronar();

        // Interface não criar um objeto
        // Animal animalGalinha = new Animal() // não consigo criar, pois é interface
        // Abaixo galinha e gato não utilizam new porque eles não são objetos novos, foram criados anteriormente.
        Animal animalGalinha = galinha;
        Animal animalGatinho = gato;
        System.out.println("=== Polimorfismo ===");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();

    }
}