import java.util.ArrayList;
import java.util.List;

public class Hold {

  private List<Suitcase> suitcases;
  private int maxWeight;

  public Hold(int maxWeight) {
    this.suitcases = new ArrayList<>();
    this.maxWeight = maxWeight;
  }

  public int totalWeight() {
    int sumWeight = 0;

    for (Suitcase suitcase : suitcases) {
      sumWeight += suitcase.totalWeight();
    }

    return sumWeight;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
      this.suitcases.add(suitcase);
    }
  }

  public void printItems() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printItems();
    }
  }

  @Override
  public String toString() {
    return this.suitcases.size() + " suitcases" + " (" + totalWeight() + "kg" + ")";
  }
}
