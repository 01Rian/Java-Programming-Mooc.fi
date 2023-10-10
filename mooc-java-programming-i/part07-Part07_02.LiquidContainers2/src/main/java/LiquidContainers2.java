
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.contains() + "/100");
            System.out.println("Second: " + secondContainer.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            Integer amount = Integer.parseInt(parts[1]);
            String command = parts[0];

            if (command.equals("add"))
                firstContainer.add(amount);

            if (command.equals("move")) {
                if (amount > firstContainer.contains()) {
                    amount = firstContainer.contains();
                }

                firstContainer.remove(amount);
                secondContainer.add(amount);
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
