package Aulas.poo;

public class Bicicleta extends Object{
    private int marcha;
    private int velocidade;

    public Bicicleta(int marcha, int velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    // o @override toString ele altera  o funcionamento do objeto to String
    // do sistema fazendo com que no println ele exiba a mensagem abaixo
    @Override
    public String toString() { // retornar a representação do objeto em string
        return "Bicicleta (marcha" + this.marcha + "," + " velocidade " + this.velocidade + ")";
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(21,0);
        Bicicleta bicicleta2 = new Bicicleta(15,10);
        System.out.println(bicicleta);
        System.out.println(bicicleta2);
        bicicleta.marcha = 300;
        System.out.println(bicicleta);
    }
}
