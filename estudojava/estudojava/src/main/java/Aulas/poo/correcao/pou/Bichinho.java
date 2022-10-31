package Aulas.poo.correcao.pou;

import java.util.ArrayList;

/**
 * Crie uma classe Bichinho:
 * 	* Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
 * 	* Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
 * 	* Métodos:
 * 		- comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
 * 	  - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
 * 		- acordar() => altera o boolean estaDormindo p/ false
 */

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;

    public Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList<>(); // bucho vazio
        this.estaDormindo = false; // acordado
    }

    public void comer(Comida comida) {
        if(this.estaDormindo) {
            System.out.println("zzzzzzzzz");
        } else { // esta acordado
            if(this.bucho.contains(comida)) {
                System.out.println("Já comi " + comida.getNome() + " !");
            } else { // a comida é nova
                this.bucho.add(comida);
                this.peso += comida.getPeso();
            }
        }
    }

    public void dormir(int horas) {
        this.estaDormindo = true;
        double porcentagemPeso = this.peso * 0.1;
        double quilosPerdidos = horas + porcentagemPeso;
        this.peso -= quilosPerdidos;
    }

    public void acordar() {
        this.estaDormindo = false;
    }

    public static void main(String[] args) {
        Bichinho pou = new Bichinho("Pou",5,100);
        Comida batata = new Comida("Batata",15.0);
        pou.comer(batata);
        pou.comer(batata);
        pou.dormir(2); // this.estaDormindo = true
        pou.comer(batata);

        pou.acordar();
        Comida frango = new Comida("frango",30.0);
        pou.comer(frango);
        pou.comer(frango);
    }
}
