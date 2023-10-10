
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;

        while(true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            if (age < Integer.valueOf(parts[1])) {
                age = Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);
        scanner.close();
    }
}
