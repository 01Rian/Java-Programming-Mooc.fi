import java.util.ArrayList;

public class Box implements Packable {

  private double maxWeight;
  private ArrayList<Packable> boxes;

  public Box(double maxWeight) {
    this.maxWeight = maxWeight;
    this.boxes = new ArrayList<>();
  }

  public void add(Packable packable) {
    if (packable.weight() < maxWeight) {
      this.boxes.add(packable);
      this.maxWeight -= packable.weight();
    }
  }

  @Override
  public double weight() {
    double weight = 0;

    for (Packable box : boxes) {
      weight += box.weight();
    }

    return weight;
  }

  @Override
  public String toString() {
    return "Box: " + boxes.size() + " items" + ", total weight " + weight() + " kg";
  }
}
