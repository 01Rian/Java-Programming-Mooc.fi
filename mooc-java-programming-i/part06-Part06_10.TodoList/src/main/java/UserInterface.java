import java.util.Scanner;

public class UserInterface {

  private final Scanner scanner;
  private final TodoList todoList;

  public UserInterface(TodoList todoList, Scanner scanner) {
    this.todoList = todoList;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scanner.nextLine();

      if (command.equals("stop")) {
        break;
      }

      handleInputCommand(command);
    }
  }

  public void handleInputCommand(String command) {
    if (command.equals("add")) addTask(); 
    
    if (command.equals("list")) listAllTask();
    
    if (command.equals("remove")) removeTask();
  }

  public void addTask() {
    System.out.print("To add: ");
    String task = scanner.nextLine();

    this.todoList.add(task);
  }

  public void listAllTask() {
    this.todoList.print();
  }

  public void removeTask() {
    System.out.print("Which one is removed? ");
    int removeTaskIndex = Integer.valueOf(scanner.nextLine());

    this.todoList.remove(removeTaskIndex);
  }
}
