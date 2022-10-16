public class ParOuImpar {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Número inválido de argumentos, é esperado que seja informado um argumento");
            return;
        }
        if (Integer.parseInt(args[0]) % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}
