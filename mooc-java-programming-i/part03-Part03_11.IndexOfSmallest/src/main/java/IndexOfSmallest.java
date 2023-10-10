
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            numbers.add(input);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int firstElement = numbers.get(0);
        int index = 0;

        while(index < numbers.size()) {
            int number = numbers.get(index);

            if (number < firstElement) {
                firstElement = number;
                System.out.println("Found at index: " + index);
            }
            index++;
        }
        System.out.println("Smallest number: " + firstElement);

    }
}
