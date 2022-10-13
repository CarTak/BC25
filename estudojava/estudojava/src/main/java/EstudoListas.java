import java.util.ArrayList;
public class EstudoListas {
    public static void main(String[] args) {
        // Listas não aceitam  tipo do módulo primário
        ArrayList<Integer> numeros = new ArrayList<>();// cria um novo Array list vazio
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);
        // Adicionando elementos do array

        numeros.add(25);// equivale ao push do JS
        numeros.add(10);
        numeros.add(10);
        numeros.add(10);
        numeros.add(1, 45);
        System.out.println(numeros);

        System.out.println(numeros.get(2));// pegar um elemnto com o índice

        numeros.set(0, 500); //(indice,novoValor)

        System.out.println(numeros);

        numeros.remove(0); // Remove o Elemento na posição

        System.out.println(numeros);

        System.out.println(numeros.size());//array.length

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));

        }
        for (int numero : numeros) {// para cada valor dentro do array ele executa o codigo (for of do Js)
            System.out.println(numeros);
        }
        System.out.println(numeros.contains(500));  // true =achou, false =não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição do 1000 na lista?
        System.out.println(numeros.indexOf(500)); // -1 não achou  o elemento
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontrado
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encorado
    }
}