
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                count = count + 1;
                sum = sum + number;
            }

        }

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = sum / count;
            System.out.println("Average of the numbers: " + average);
        }

        scanner.close();
    }
}
