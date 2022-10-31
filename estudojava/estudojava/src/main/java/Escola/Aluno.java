package Escola;


import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aluno {
    private static int idAluno ;
    private String nome;
    private String sobrenome;
    private String email;
    private Date dataNasc;

    public Aluno(String nome, String sobrenome, String email, Date dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNasc = dataNasc;
    }

    public static int getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 0 && nome.length() < 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. Atributo não modificado");
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if(sobrenome.length() > 0 && sobrenome.length() < 30) {
            this.sobrenome = sobrenome;
         } else {
            System.out.println("Sobrenome inválido. Atributo não modificado");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                boolean isEmailIdValid = true;
                this.email = email;
            }
        }
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        Date dataAtual = new Date();
        Date data = new Date(String.valueOf(dataNasc));
        if (data.getTime() < dataAtual.getTime()) {
            this.dataNasc = dataNasc;
        }else {
            System.out.println("Data de Nascimento inválido. Atributo não modificado");
        }
    }
}
