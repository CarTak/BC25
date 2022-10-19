package Exercicios;

//3) Crie uma classe Autor que possui:
//        Atributos: nome, email;
//        Construtores:
//        - Cria autores com base nos parâmetros nome e email;
//        Métodos:
//        - alteraNome(String novoNome) => muda o nome atual do autor
//        - alteraEmail(String novoEmail) => muda o email atual do autor

public class Autor {
    private String autor;
    private String email;

    Autor(String autor,String email) {
        this.autor = autor;
        this.email = email;
    }

    public String getAutor() {
        return autor;
    }

    public String getEmail() {
        return email;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
