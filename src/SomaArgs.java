import java.util.Scanner;

public class SomaArgs {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        int argsFaltantes = 2 - args.length;
        Scanner sc = new Scanner(System.in);

        if (args.length > 2){
            System.out.println("Quantidade invalida");
            return;
        }
        for (int i = 0; i < args.length; i++){
            numeros[i] = Integer.parseInt(args[i]);
        }

        while (argsFaltantes > 0){
            System.out.println("Digite um número inteiro:");
            numeros[2 - argsFaltantes] = sc.nextInt();
            argsFaltantes--;
        }

        int resultado = numeros[0] + numeros[1];
        System.out.println("Resultado da soma é " + resultado);
    }
}
