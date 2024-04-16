import java.util.Scanner;
public class Atividade03_06 {
    public static void main(String[] args) {

        String nomeProduto;
        double precoProduto;
        double desconto;
        double valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine();
        System.out.println("Digite o preco do produto: ");
        precoProduto = scanner.nextDouble();
        System.out.print("Digite a porcentagem(%) de desconto do produto: ");
        desconto = scanner.nextDouble();

        scanner.close();

        valorFinal = precoProduto - (precoProduto * (desconto / 100));

        System.out.println("O valor final do " +nomeProduto+ " é:" + valorFinal);

    }
}

