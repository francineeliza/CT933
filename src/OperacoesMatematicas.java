import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        double numero1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Qual operação deseja fazer? ( opções: + - / * )");
        String operacao = sc.nextLine();
        if (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("/") && !operacao.equals("*")) {
            System.out.println("Operação desconhecida");
            return;
        }
        System.out.println("Informe o segundo número:");
        double numero2 = sc.nextDouble();
        double resultado = 0;

        switch (operacao) {
            case "+" -> resultado = numero1 + numero2;
            case "-" -> resultado = numero1 - numero2;
            case "/" -> resultado = numero1 / numero2;
            case "*" -> resultado = numero1 * numero2;
        }
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
