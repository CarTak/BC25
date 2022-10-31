package Exercicios;

public class cantor extends Heranca{
    private String banda;
    private String cantor;
    private String guitarrista;

    public cantor(String nome, String cargo, String aprender, String andar,
                  String comer, String banda, String cantor, String guitarrista) {
        super(nome, cargo, aprender, andar, comer);
        this.banda = banda;
        this.cantor = cantor;
        this.guitarrista = guitarrista;
    }
}
