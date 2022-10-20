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
        double totalJuros = 0;
        double totalAmortizacao = 0;
        double prestacao = valorEmprestimo * (Math.pow((1 + taxaJuros), tempoPagamento) * taxaJuros) / (Math.pow((1 + taxaJuros), tempoPagamento) - 1);
        double totalPrestacao = prestacao * tempoPagamento;

        System.out.printf("Valor fixo da parcela R$ %.2f, Saldo devedor total R$ %.2f%n", prestacao, valorEmprestimo);

        for (int i = 0; i < tempoPagamento; i++) {
            double juros = saldoDevedor * taxaJuros;
            double amortizacao = prestacao - juros;
            totalJuros = juros + totalJuros;
            totalAmortizacao = amortizacao + totalAmortizacao;
            saldoDevedor = saldoDevedor - amortizacao;

            if (saldoDevedor < 0.01) {
                saldoDevedor = 0;
            }
            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f%n", i + 1, juros, amortizacao, saldoDevedor);
        }
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", totalPrestacao, totalJuros, totalAmortizacao);
        sc.close();
    }
}
