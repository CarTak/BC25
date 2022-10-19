package Aulas.poo;
import java.util.ArrayList;
public class Pessoa { // abstrair --> simplificar
    // Propriedades /atributos de uma Pessoa
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;

    ArrayList<Pessoa> conhecidos= new ArrayList<>();


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
    public void dizOla() { // método
        System.out.println("Olá, tudo bem? " + this.nome);
    }
    public void mostrarImc() {
//      double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("O meu IMC é " + imc);
    }
    public double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }

    public void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)) {
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this); // this é o objeto que chama cumprimentar()
        }
    }
    private void addPessoaNova(Pessoa pessoa){ //faz o objeto "conhecer"
        System.out.println(this.nome + " conheceu " + pessoa.nome + " !!!");
        this.conhecidos.add(pessoa);
    }

    public boolean conhecePessoa(Pessoa pessoa) {
        //se true, a pessoa (this) conhece a outra pesssoa
        // se false, não conhece
        return this.conhecidos.contains(pessoa);
    }
    public double getAltura(){
        return this.altura;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String NovoNome){
        this.nome = NovoNome;
    }
    public void setSobrenome(String NovoSobrenome){
        this.sobrenome = NovoSobrenome;
    }
    public void setIdade(int NovoIdade){
        this.idade = NovoIdade;
    }
    public void setAltura(double NovoAltura){
        this.altura = NovoAltura;
    }
    public void setPeso(double NovoPeso){
        this.peso = NovoPeso;
    }

}
