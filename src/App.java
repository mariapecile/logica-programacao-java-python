import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.print("Qual sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("Você estuda programação?");
        boolean sim = scanner.nextBoolean();

        System.out.println("===== CADASTRO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estuda programação: " + sim);

        scanner.close();
    }
}
