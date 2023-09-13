import java.util.Scanner;

public class NumbersUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número, digite 0 para finalizar:\n");
        int number = scanner.nextInt();
        while (number != 0) {
            number = scanner.nextInt();
        }
        System.out.println("Finalizando...");

        scanner.close();
    }
}
