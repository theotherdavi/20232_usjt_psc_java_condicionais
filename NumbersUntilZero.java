import java.util.Scanner;

public class NumbersUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número, digite 0 para finalizar:\n");
        int acc = 0;
        int number = scanner.nextInt();
        acc += number;
        int counter = 0;
        while (number != 0) {
            System.out.print("Próximo: ");
            number = scanner.nextInt();
            acc += number;
            counter += 1;
        }
        double media = acc / counter;
        System.out.println("Valor final: " + acc + "\nMédia: " + media);

        scanner.close();
    }
}
