import java.util.List;

public class NotasMoeadas {

    int valorTotalEmNotas;
    int valorTotalEmMoedas;

    public int quantidadeNecessaria(int valor, int nota) {
        return valor / nota;
    }

    public void decomporValorTotalEmNotas(int quantidadeDeNotas, int multiplicador) {
        valorTotalEmNotas -= quantidadeDeNotas * multiplicador;
    }

    public void decomporValorTotalEmMoedas(int quantidadeDeMoedas, int multiplicador) {
        valorTotalEmMoedas -= quantidadeDeMoedas * multiplicador;
    }

    public void imprimirQuantidadeDeNotasNecessarias(List<Integer> notas) {
        System.out.println("Notas:");
        System.out.printf("%d nota(s) de R$ 100.00%n", notas.get(0));
        System.out.printf("%d nota(s) de R$ 50.00%n", notas.get(1));
        System.out.printf("%d nota(s) de R$ 20.00%n", notas.get(2));
        System.out.printf("%d nota(s) de R$ 10.00%n", notas.get(3));
        System.out.printf("%d nota(s) de R$ 5.00%n", notas.get(4));
        System.out.printf("%d nota(s) de R$ 2.00%n", notas.get(5));
        System.out.println("------------------------");
    }

    public void imprimirQuantidadeDeMoedasNecessarias(List<Integer> moedas) {
        System.out.println("Moedas:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moedas.get(0));
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas.get(1));
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedas.get(2));
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedas.get(3));
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedas.get(4));
        System.out.printf("%d moeda(s) de R$ 0.01%n", valorTotalEmMoedas);
        System.out.println("------------------------");
    }
}
