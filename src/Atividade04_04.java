import java.util.Scanner;
public class Atividade04_04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero, segundoNumero, resultado;

        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro numero é maior que o segundo numero");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O segundo numero é maior que o primeiro numero");
        } else {
            System.out.println("Os numeros são iguais!");
        }


        scanner.close();


    }
}
