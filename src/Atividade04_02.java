import java.util.Scanner;
public class Atividade04_02 {
    public static void main(String[] args) {
        int valor1, valor2, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu valor 1: ");
        valor1 = scanner.nextInt();
        System.out.println("Digite o seu valor 2: ");
        valor2 = scanner.nextInt();

        resultado = valor1 + valor2;

        if (resultado % 2 == 0) {
            System.out.println("o resultado é par.");
        } else {
            System.out.println("O resultado é impar.");
        }

        scanner.close();

    }
}
