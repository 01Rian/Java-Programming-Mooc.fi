
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            numbers.add(input);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        int index = 0;

        for (Integer number : numbers) {
            sum += number;
            index += 1;
        }
        
        double average = (double) sum / index;

        System.out.println("Average: " + average);
        scanner.close();
        
    }
}
