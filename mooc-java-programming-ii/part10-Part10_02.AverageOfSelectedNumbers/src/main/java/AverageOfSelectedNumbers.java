
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(Integer.parseInt(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            System.out.println("Average of the negative numbers: "
                    + inputs.stream().mapToInt(i -> i).filter(i -> i < 0).average().getAsDouble());
        } else if (choice.equals("p")) {
            System.out.println("Average of the positive numbers: "
                    + inputs.stream().mapToInt(i -> i).filter(i -> i > 0).average().getAsDouble());
        }
    }
}
