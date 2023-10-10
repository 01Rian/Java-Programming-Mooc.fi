import java.util.Scanner;

public class UserInterface {

  private final Database database;
  private final Scanner scanner;

  public UserInterface(Database database, Scanner scanner) {
    this.database = database;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.print("? ");
      String input = scanner.nextLine();

      if (input.equals("Quit")) {
        break;
      }

      handleInput(input);
    }
  }

  private void handleInput(String input) {
    if (input.equals("Add")) {
      add();
    }

    if (input.equals("Observation")) {
      observation();
    }

    if (input.equals("All")) {
      all();
    }

    if (input.equals("One")) {
      one();
    }
  }

  private void add() {
    System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("Name in Latin: ");
    String latinName = scanner.nextLine();

    database.addBird(new Bird(name, latinName));
  }

  private void observation() {
    System.out.print("Bird? ");
    String bird = scanner.nextLine();

    for (Bird b : database.getBirds()) {
      if (b.getName().equals(bird)) {
        b.addObservation();
      } else {
        System.out.println("Not a bird!");
      }
    }
  }

  private void all() {
    if (database.getBirds().isEmpty()) {
      return;
    }

    for (Bird b : database.getBirds()) {
      System.out.println(b);
    }
  }

  private void one() {
    if (database.getBirds().isEmpty()) {
      return;
    }

    System.out.print("Bird?");
    String bird = scanner.nextLine();

    for (Bird b : database.getBirds()) {
      if (b.getName().equals(bird)) {
        System.out.println(b);
      } else {
        System.out.println("Not a bird!");
      }
    }
  }
}
