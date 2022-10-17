package Aulas.poo;

// O Intuito: testar o uso de classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        //  New => constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);
        Pessoa pessoa5 = new Pessoa("Carlos", "José", 22, 1.9, 77.0);

        Pessoa recemNascido = new Pessoa("Pedro", "Gomes");
        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");
    }
}
