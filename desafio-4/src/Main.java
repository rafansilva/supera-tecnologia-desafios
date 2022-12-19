import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int numeroDeLinhas = scanner.nextInt();

        System.out.println("Digite a frase: ");
        for (int i = 0; i < numeroDeLinhas; i++) {
            String frase = lerLinha(scanner);
            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
        }
    }

    public static String lerLinha(Scanner scanner) {
        String linha = scanner.nextLine();
        while (linha.isEmpty()){
            linha = scanner.nextLine();
        }

        return linha;
    }
}