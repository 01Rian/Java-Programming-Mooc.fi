import java.util.Scanner;

public class TextUI {

  private final Scanner scanner;
  private final SimpleDictionary dictionary;

  public TextUI(Scanner scanner, SimpleDictionary dictionary) {
    this.scanner = scanner;
    this.dictionary = dictionary;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String word = scanner.next();

      if (word.equals("end")) {
        System.out.println("Bye bye!");
        break;
      }

      if (word.equals("add")) {
        addString();
      }

      if (word.equals("search")) {
        searchString();
      }

      System.out.println("Unknown command");
    }
  }

  public void addString() {
    System.out.print("Word: ");
    String wordString = scanner.next();

    System.out.print("Translation: ");
    String translationString = scanner.next();

    this.dictionary.add(wordString, translationString);
  }

  public void searchString() {
    System.out.print("To be translated: ");
    String searchString = scanner.next();

    System.out.print("Translation: ");
    String translationString = this.dictionary.translate(searchString);

    if (translationString == null) {
      System.out.println("Word " + searchString + " was not found");
      return;
    }

    System.out.println(translationString);
  }
}
