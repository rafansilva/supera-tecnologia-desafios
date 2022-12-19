import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = pegarNumerosEntrada();

        List<Integer> listaDePares = new ArrayList<>();
        List<Integer> listaDeImpares = new ArrayList<>();
        List<Integer> novaListaDeNumeros = new ArrayList<>();

        for (int i = 0; i < listaDeNumeros.size(); i++) {
            if (listaDeNumeros.get(i) % 2 == 0) {
                listaDePares.add(listaDeNumeros.get(i));
            } else {
                listaDeImpares.add(listaDeNumeros.get(i));
            }
        }

        var listaDeParesSorted = ordemCrescente(listaDePares);
        var listaDeImparesSorted = ordemDecrescente(listaDeImpares);

        novaListaDeNumeros.addAll(listaDeParesSorted);
        novaListaDeNumeros.addAll(listaDeImparesSorted);

        novaListaDeNumeros.forEach(System.out::println);
    }

    private static List<Integer> pegarNumerosEntrada() {
        Scanner entrada = new Scanner(System.in);

        boolean digitarProximo = true;
        List<Integer> listaDeNumeros = new ArrayList<>();

        while (digitarProximo) {
            System.out.print("Digite um número positivo inteiro: ");
            int numero = entrada.nextInt();

            listaDeNumeros.add(numero);

            System.out.print("Deseja continuar? (true/false) ");
            digitarProximo = entrada.nextBoolean();
        }

        return listaDeNumeros;
    }

    public static List<Integer> ordemCrescente(List<Integer> pares) {
        Collections.sort(pares);
        return pares;
    }

    public static List<Integer> ordemDecrescente(List<Integer> impares) {
        impares.sort(Collections.reverseOrder());
        return impares;
    }
}