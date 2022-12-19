import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em valor monetário (Ex. 576.73): ");
        double valorTotal = scanner.nextDouble();

        NotasMoeadas notasMoeadas = new NotasMoeadas();
        notasMoeadas.valorTotalEmNotas = (int) valorTotal;
        notasMoeadas.valorTotalEmMoedas = (int) ((valorTotal - notasMoeadas.valorTotalEmNotas) * 100);
        List<Integer> listaDeNotas = new ArrayList<>();
        List<Integer> listaDeMoedas = new ArrayList<>();

        int notasDe100 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 100);
        notasMoeadas.decomporValorTotalEmNotas(notasDe100, 100);
        listaDeNotas.add(notasDe100);

        int notasDe50 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 50);
        notasMoeadas.decomporValorTotalEmNotas(notasDe50, 50);
        listaDeNotas.add(notasDe50);

        int notasDe20 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 20);
        notasMoeadas.decomporValorTotalEmNotas(notasDe20, 20);
        listaDeNotas.add(notasDe20);

        int notasDe10 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 10);
        notasMoeadas.decomporValorTotalEmNotas(notasDe10, 10);
        listaDeNotas.add(notasDe10);

        int notasDe5 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 5);
        notasMoeadas.decomporValorTotalEmNotas(notasDe5, 5);
        listaDeNotas.add(notasDe5);

        int notasDe2 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 2);
        notasMoeadas.decomporValorTotalEmNotas(notasDe2, 2);
        listaDeNotas.add(notasDe2);

        int moedasDe1 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmNotas, 1);
        notasMoeadas.decomporValorTotalEmNotas(moedasDe1, 1);
        listaDeMoedas.add(moedasDe1);

        int moedasDe50 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmMoedas, 50);
        notasMoeadas.decomporValorTotalEmMoedas(moedasDe50, 50);
        listaDeMoedas.add(moedasDe50);

        int moedasDe25 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmMoedas, 25);
        notasMoeadas.decomporValorTotalEmMoedas(moedasDe25, 25);
        listaDeMoedas.add(moedasDe25);

        int moedasDe10 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmMoedas, 10);
        notasMoeadas.decomporValorTotalEmMoedas(moedasDe10, 10);
        listaDeMoedas.add(moedasDe10);

        int moedasDe5 = notasMoeadas.quantidadeNecessaria(notasMoeadas.valorTotalEmMoedas, 5);
        notasMoeadas.decomporValorTotalEmMoedas(moedasDe5, 5);
        listaDeMoedas.add(moedasDe5);


        notasMoeadas.imprimirQuantidadeDeNotasNecessarias(listaDeNotas);
        notasMoeadas.imprimirQuantidadeDeMoedasNecessarias(listaDeMoedas);
    }
}