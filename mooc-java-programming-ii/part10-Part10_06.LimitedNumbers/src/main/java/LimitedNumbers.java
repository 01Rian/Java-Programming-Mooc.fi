
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputs = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            inputs.add(number);
        }

        inputs.stream()
                .filter(i -> i <= 5 && i >= 1)
                .forEach(System.out::println);
    }
}
