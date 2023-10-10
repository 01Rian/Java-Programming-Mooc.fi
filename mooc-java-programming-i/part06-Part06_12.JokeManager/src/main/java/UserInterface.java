import java.util.Scanner;

public class UserInterface {

  private JokeManager jokeManager;
  private Scanner scanner;

  public UserInterface(JokeManager jokeManager, Scanner scanner) {
    this.jokeManager = jokeManager;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.println("Commands: ");

      System.out.println("1 - add a joke");
      System.out.println("2 - draw a joke");
      System.out.println("3 - list jokes");

      System.out.println("X - stop");
      String input = scanner.nextLine();

      if (input.equals("X"))
        break;

      handleInput(input);
    }
  }

  public void handleInput(String input) {
    if (input.equals("1"))
      addJoke();

    if (input.equals("2"))
      drawJoke();

    if (input.equals("3"))
      listJoke();
  }

  public void addJoke() {
    System.out.print("Write the joke to be added: ");
    String jokeString = scanner.nextLine();

    this.jokeManager.addJoke(jokeString);
  }

  public void drawJoke() {
    System.out.println(this.jokeManager.drawJoke());
  }

  public void listJoke() {
    this.jokeManager.printJokes();
  }
}
