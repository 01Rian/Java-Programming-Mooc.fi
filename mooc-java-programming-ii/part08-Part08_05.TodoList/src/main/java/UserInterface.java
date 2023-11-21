import java.util.Scanner;

public class UserInterface {
  
  private final TodoList list;
  private final Scanner scanner;

  public UserInterface(TodoList list, Scanner scanner) {
    this.list = list;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scanner.nextLine();

      if (command.equals("stop")) {
        break;
      }

      handleInput(command);
    }
  }

  private void handleInput(String command) {
    if (command.equals("add")) add();

    if (command.equals("list")) list();

    if (command.equals("remove")) remove();
  }

  private void add() {
    System.out.print("To add: ");
    String taskString = scanner.nextLine();

    list.add(taskString);
  }

  private void list() {
    list.print();
  }

  private void remove() {
    System.out.print("Which one is removed? ");
    int index = scanner.nextInt();

    list.remove(index);
  }
}
