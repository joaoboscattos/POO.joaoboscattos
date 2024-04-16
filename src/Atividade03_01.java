import java.util.Scanner;
public class Atividade03_01 {
    public static void main(String[] args) {

        int valor1;
        int valor2;
        int valor3;
        int resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        valor1 = scanner.nextInt();
        System.out.println("Digite o 2° valor: ");
        valor2 = scanner.nextInt();
        System.out.println("Digite o 3° valor: ");
        valor3 = scanner.nextInt();
        resultado = valor1 + valor2 + valor3;

        scanner.close();

        System.out.println("O resultado eh: " + resultado);

    }
}

