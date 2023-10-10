
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.print("Identifier? (empty will stop) ");
            String identifier = scanner.nextLine();

            if (identifier.equals("")) {
                break;
            }

            System.out.print("Name? (empty will stop) ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            Archive archive = new Archive(identifier, name);

            if (archives.contains(archive)) {
                continue;
            }

            archives.add(archive);
        }

        for (Archive archive : archives) {
            System.out.println(archive);
        }
    }
}
