import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

  private List<T> val;

  public Pipe() {
    this.val = new ArrayList<>();
  }

  public void putIntoPipe(T value) {
    this.val.add(value);
  }

  public T takeFromPipe() {
    if (val.isEmpty())
      return null;

    return val.remove(val.size() - 1);
  }

  public boolean isInPipe() {
    return this.val.size() > 0 ? true : false;
  }
}
