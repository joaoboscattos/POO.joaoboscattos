
import java.util.Scanner;
public class Atividade03_05 {
    public static void main(String[] args) {

        int valor1;
        int valor2;
        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        valor1 = scanner.nextInt();
        System.out.println("Digite o 2° valor: ");
        valor2 = scanner.nextInt();

        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        divisao = valor1 / valor2;
        multiplicacao = valor1 % valor2;

        scanner.close();

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtracao é: " + subtracao);
        System.out.println("O resultado da duvisao é: " + divisao);
        System.out.println("O resultado da multiplicacao é: " + multiplicacao);

    }
}
