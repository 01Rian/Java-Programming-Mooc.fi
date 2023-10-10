
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum = sum + i + 1;
        }

        System.out.println(sum);
        scanner.close();
    }
}
