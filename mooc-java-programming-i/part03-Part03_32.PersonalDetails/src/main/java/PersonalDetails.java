
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int birthYears = 0;
        int count = 0;
        int length = 0;

        while(true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            if (length < input.length()) {
                length = input.length();
                name = parts[0];
            }

            birthYears += Integer.valueOf(parts[1]);
            count++;
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years:" + (1.0 * birthYears / count));
        scanner.close();

    }
}
