package Aulas.poo;

// O Intuito: testar o uso de classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        //  New => constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("José");
        pessoa1.setSobrenome("Carlos");
        pessoa1.setIdade(29);
        pessoa1.setPeso(55.0);
        pessoa1.setAltura(1.65);

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
    //    System.out.println(pessoa2.setNome());

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);
        Pessoa pessoa5 = new Pessoa("Carlos", "José", 22, 1.9, 77.0);

        Pessoa recemNascido = new Pessoa("Pedro", "Gomes");
    //    System.out.println(recemNascido.getAltura());
    //    recemNascido.getIdade()++; // envelhecer
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");

        // Exemplo pessoa
        Pessoa pedro = new Pessoa ("Pedro","Jose",29,1.8,80);
        Pessoa joao = new Pessoa ("João","Carlos",30,1.75,90);

        //aqui não vai funcionar por que o metodo addPessoaNova
        // está private ele só vai funcionar dentro da classe.
        // o método fora da classe não deveria teoricamente  poder
        //fazer a alteração. Por isso colocar private.
        //pedro.addPessoaNova(joao);

        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);
        pedro.comer("Batata");
    }
}
