import java.util.Scanner;

public class NumbersUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número, digite 0 para finalizar:\n");
        int acc = 0;
        int number = scanner.nextInt();
        acc += number;
        while (number != 0) {
            System.out.print("Próximo: 1");
            number = scanner.nextInt();
            acc += number;
        }
        System.out.println("Valor final: " + acc);

        scanner.close();
    }
}
