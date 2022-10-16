import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {

        System.out.println("Informe sua altura em metros?");
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        System.out.println("Informe seu peso em Kg?");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        if (imc < 17){
            System.out.printf("O valor do seu IMC é %.2f (considerado muito abaixo do peso)%n", imc);
        }
        else if (imc >= 17 && imc <= 18.49){
            System.out.printf("O valor do seu IMC é %.2f (considerado abaixo do peso)%n", imc);
        }
        else if (imc >= 18.50 && imc <= 24.99){
            System.out.printf("O valor do seu IMC é %.2f (considerado peso normal)%n", imc);
        }
        else if (imc >= 25 && imc <= 29.99){
            System.out.printf("O valor do seu IMC é %.2f (considerado acima do peso)%n", imc);
        }
        else if (imc >= 30 && imc <= 34.99){
            System.out.printf("O valor do seu IMC é %.2f (considerado Obesidade I) %n", imc);
        }
        else if (imc >= 35 && imc <= 39.99){
            System.out.printf("O valor do seu IMC é %.2f (considerado Obesidade II (severa))%n", imc);
        }
        else if (imc >= 40) {
            System.out.printf("O valor do seu IMC é %.2f (Obesidade III (mórbida))%n", imc);

        }
        sc.close();


    }
}