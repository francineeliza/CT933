import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        int[] notas = new int[4];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 4) {
            System.out.println("Informe a nota da prova " + (i + 1));
            int nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
                return;
            }
            notas[i] = nota;
            i++;
        }
        sc.close();
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4.0;
        System.out.printf("A média do aluno é %.2f", media);
    }
}
