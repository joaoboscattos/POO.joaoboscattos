import java.util.Scanner;
/*RESOLVIDO (nextLine depois do nextDouble sem o scanner.nextLine() para quebra de linha)
*/
public class Atividade02_01 {
    public static void main(String[] args) {

        String nome = "";
        int idade = 0;
        double peso = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seus dados:  ");
        nome = scanner.nextLine();
        idade = scanner.nextInt();
        peso = scanner.nextDouble();

        scanner.close();

        System.out.println("Nome "+ nome);
        System.out.println("idade "+ idade);
        System.out.println("peso "+ peso);
    }
}
