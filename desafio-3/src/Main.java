import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tamanhoDaLista = scanner.nextInt();

        System.out.print("Digite um número alvo (Ex. 2): ");
        int alvo = scanner.nextInt();

        List<Integer> array = new ArrayList<>();

        System.out.println("Digite os números da lista: ");
        for (int i = 0; i < tamanhoDaLista; i++) {
            array.add(scanner.nextInt());
        }

        int valoresIgualAoAlvo = 0;

        for (int i = 0; i < array.size(); i++) {
            int sub = array.get(i);
            for (int j = i + 1; j < array.size(); j++) {
                sub -= array.get(j);

                if (Math.abs(sub) == alvo){
                    valoresIgualAoAlvo++;
                }
            }
        }

        System.out.printf("Existe %d valores cuja diferença é igual ao número alvo informado.%n", valoresIgualAoAlvo);

    }
}