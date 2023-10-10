import java.util.ArrayList;

public class Stack {
  
  private ArrayList<String> stack;

  public Stack() {
    this.stack = new ArrayList<>();
  }

  public boolean isEmpty() {
    if (stack.size() == 0) {
      return true;
    }

    return false;
  }

  public void add(String value) {
    this.stack.add(value);
  }

  public ArrayList<String> values() {
    ArrayList<String> newStack = new ArrayList<>();

    for (String value : this.stack) {
      newStack.add(value);
    }

    return newStack;
  }

  public String take() {
    int lastElement = this.stack.size() - 1;

    String value = this.stack.get(lastElement);

    this.stack.remove(lastElement);

    return value;
  }
}
