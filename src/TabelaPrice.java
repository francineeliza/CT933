import java.util.Scanner;

public class TabelaPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de um empréstimo:");
        double valorEmprestimo = sc.nextDouble();
        System.out.println("Informe a taxa de juros do empréstimo:");
        double taxaJuros = sc.nextDouble() / 100;
        System.out.println("Informe o tempo para pagamento:");
        int tempoPagamento = sc.nextInt();
        double saldoDevedor = valorEmprestimo;

        double prestacao = valorEmprestimo * (Math.pow((1 + taxaJuros), tempoPagamento) * taxaJuros) / (Math.pow((1 + taxaJuros), tempoPagamento) - 1);
        System.out.printf("Valor fixo da parcela R$ %.2f, Saldo devedor total R$ %.2f%n", prestacao, valorEmprestimo);

        for (int i = 0; i < tempoPagamento; i++) {
            double juros = saldoDevedor * taxaJuros;
            double amortizacao = prestacao - juros;
            saldoDevedor = saldoDevedor - amortizacao;

            if (saldoDevedor < 0.01) {
                saldoDevedor = 0;
            }
            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f%n", i + 1, juros, amortizacao, saldoDevedor);
        }
        sc.close();
    }
}
