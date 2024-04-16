import java.util.Scanner;
public class Atividade04_01 {
    public static void main(String[] args) {
        String nomePessoa;
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nomePessoa = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        scanner.close();

    }
}
