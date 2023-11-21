
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();

            if (numbers.isEmpty() && number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                break;
            }

            if (number > 0) {
                numbers.add(number);
            }
        }

        double avg = average(numbers);
        System.out.println(avg);
    }

    public static double average(List<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }

        return sum / (double) list.size();
    }
}
