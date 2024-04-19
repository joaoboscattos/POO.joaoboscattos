import java.util.Scanner;

public class Atividade05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número inicial de patinhos:");
        int n = scanner.nextInt();
        
        for (int i = n; i > 0; i--) {
            System.out.println(i + " patinhos foram passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            System.out.println();
            
            if (i > 1) {
                System.out.println("Mas só " + (i - 1) + " patinhos voltaram de lá");
                System.out.println();
            }
        }
        
        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + n + " patinhos voltaram de lá.");

    }
}