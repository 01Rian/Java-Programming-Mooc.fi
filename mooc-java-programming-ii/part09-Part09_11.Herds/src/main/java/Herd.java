import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

  private List<Movable> herds;

  public Herd() {
    this.herds = new ArrayList<>();
  }

  public void addToHerd(Movable moveble) {
    this.herds.add(moveble);
  }

  @Override
  public void move(int dx, int dy) {
    for (Movable herd : herds) {
      herd.move(dx, dy);
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (Movable herd : herds) {
      sb.append(herd.toString()).append("\n");
    }

    return sb.toString();
  }
}
