import java.util.Scanner;

public class Atividade03_03 {
    public static void main(String[] args) {

        double nota1, nota2, notaFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o resultado da 1° nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite o resultado da 2° nota: ");
        nota2 = scanner.nextDouble();

        notaFinal = (nota1 + nota2) / 2;

        scanner.close();

        System.out.println("O resulado da media das notas é: " + notaFinal);

    }
}

