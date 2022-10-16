import java.util.Scanner;

public class CalculoDeJuros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor inicial investido em R$.");
        double valorInicial = sc.nextDouble();
        System.out.println("Informe o juros ao mês em %.");
        double taxaJuros = sc.nextDouble();
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido.");
        int tempo = sc.nextInt();
        double valorAtual = valorInicial;
        double juros;

        for (int mes = 0; mes < tempo; mes++) {
            juros = valorAtual * taxaJuros / 100;
            valorAtual = valorAtual + juros;
            System.out.printf("Mês %d: Juros: R$ %.2f , saldo: %.2f%n", mes + 1, juros, valorAtual);
        }
    }
}

