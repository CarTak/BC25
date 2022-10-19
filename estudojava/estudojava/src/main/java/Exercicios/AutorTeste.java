package Exercicios;

import java.util.Scanner;

public class AutorTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Autor autor1 = new Autor("José","jose@mail.com");
        System.out.println("Digite '1' para alterar nome ou Digite '2' para alterar email : ");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
                System.out.println("Digite o novo nome: ");
                String Novonome = entrada.nextLine();
                autor1.setAutor(Novonome);
                System.out.println("Nome: " + autor1.getAutor() + " email: " + autor1.getEmail());
            } else if (opcao == 2) {
                System.out.println("Digite o novo email: ");
                String Novoemail = entrada.nextLine();
                autor1.setEmail(Novoemail);
                System.out.println("Nome: " + autor1.getAutor() + " email: " + autor1.getEmail());
            } else {
                System.out.println("Opção inválida !!");
            }
        }
    }

