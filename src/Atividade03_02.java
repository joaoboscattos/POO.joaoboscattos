import java.util.Scanner;
public class Atividade03_02 {
    public static void main(String[] args) {

        int valor1, valor2, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        valor1 = scanner.nextInt();
        System.out.println("Digite o valor 2: ");
        valor2 = scanner.nextInt();

        resultado = valor1 - valor2;

        scanner.close();

        System.out.println("O resultado é: " + resultado);

    }
}
