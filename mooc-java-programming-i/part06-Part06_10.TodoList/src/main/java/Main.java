
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface user = new UserInterface(todoList, scanner);
        user.start();


    }
}
