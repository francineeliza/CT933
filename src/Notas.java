import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de provas:");
        int quantidadeProvas = sc.nextInt();
        int[] notas = new int[quantidadeProvas];
        int menorNota = 100;
        int maiorNota = 0;
        double media;

        for (int i = 0; i < quantidadeProvas; i++) {
            int provaAtual = i + 1;
            System.out.println("Informe a nota da prova " + provaAtual + ":");
            notas[i] = sc.nextInt();

            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        int soma = 0;

        for (int i = 0; i < quantidadeProvas; i++) {
            soma += notas[i];
        }
        media = (double) soma / quantidadeProvas;
        System.out.printf("A menor nota é: %d%n", menorNota);
        System.out.printf("A maior nota é: %d%n", maiorNota);
        System.out.printf("A média das notas é: %.2f", media);
        sc.close();
    }
}