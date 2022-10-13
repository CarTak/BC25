// Enums são estruturas com constantes definidas
// Dia da semana, Meses do ano, Turnos do dia, Estações
// Niveis (junior, pleno, senior), feriados nacionais

public class EstudoEnums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA; //enum.constante
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nivel é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nivel é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nivel é SENIOR");
                break;
        }

        // Versão Enhanced
        switch (nivel) {
            case JUNIOR -> {
                System.out.println("Seu nivel é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nivel é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nivel é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
