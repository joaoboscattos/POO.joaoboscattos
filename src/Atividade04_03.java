import java.util.Scanner;
public class Atividade04_03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.println("Digite o usuario: ");
        usuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        senha = scanner.nextLine();

        if (usuario.equals("usuario") && senha.equals("senha123")) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Login não efetuado!");
        }

        scanner.close();


    }
}
