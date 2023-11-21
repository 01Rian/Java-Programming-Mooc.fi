
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("")) {
                break;
            }

            inputs.add(line);
        }

        inputs.stream()
                .forEach(System.out::println);
    }
}
