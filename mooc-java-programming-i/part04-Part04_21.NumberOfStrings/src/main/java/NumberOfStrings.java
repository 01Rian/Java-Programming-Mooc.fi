
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            String inputString = scanner.nextLine();

            if (inputString.equals("end")) {
                break;
            }

            count++;
        }

        System.out.println(count);

        scanner.close();
    }
}
