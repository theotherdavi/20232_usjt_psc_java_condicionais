import java.util.Scanner;

public class ContaIntervalo {
    public static void main (String... args)    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número!\n");
        int start = scanner.nextInt();
        System.out.print("Digite outro número!\n");
        int end = scanner.nextInt();

        int counter = start;
        System.out.print("Contador: " + counter + "\n");

        while (counter < end)  {
            if (start > end)    System.out.print("O valor de início é menor do que o final!\n");
            else    {
                counter += 1;
                System.out.print("Contador: " + counter + "\n");
            }
        }

        scanner.close();
    }
}
