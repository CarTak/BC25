package Exercicios;

public class dancarino extends Heranca{
    private String grupo;
    private String dancando;

    public dancarino(String nome, String cargo, String aprender, String andar,
                     String comer, String grupo, String dancando) {
        super(nome, cargo, aprender, andar, comer);
        this.grupo = grupo;
        this.dancando = dancando;
    }
}
