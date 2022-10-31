package Exercicios;

public class programador extends Heranca{
    private String empresa;
    private String programar;

    public programador(String nome, String cargo, String aprender,
                       String andar, String comer, String empresa, String programar) {
        super(nome, cargo, aprender, andar, comer);
        this.empresa = empresa;
        this.programar = programar;
    }

}
