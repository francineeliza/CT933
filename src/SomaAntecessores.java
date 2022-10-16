import java.util.Scanner;

public class SomaAntecessores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = sc.nextInt();
        int resultado = 0;

        while (numero > 0) {
            resultado = resultado + numero;
            numero--;
        }
        System.out.println(resultado);
        sc.close();
    }
}
