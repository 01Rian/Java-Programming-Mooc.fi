import java.util.ArrayList;
import java.util.List;

public class Suitcase {

  private List<Item> items;
  private int maxWeight;

  public Suitcase(int maxWeight) {
    this.items = new ArrayList<>();
    this.maxWeight = maxWeight;
  }

  public int totalWeight() {
    int sumWeight = 0;

    for (Item item : items) {
      sumWeight += item.getWeight();
    }

    return sumWeight;
  }

  public void addItem(Item item) {
    if (totalWeight() + item.getWeight() <= maxWeight) {
      this.items.add(item);
    }
  }

  public void printItems() {
    for (Item item : items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    if (this.items.size() == 0) {
      return null;
    }

    Item firstItem = this.items.get(0);

    for (Item item : items) {
      if (item.getWeight() > firstItem.getWeight()) {
        firstItem = item;
      }
    }

    return firstItem;
  }

  @Override
  public String toString() {
    if (totalWeight() == 0) {
      return "no items" + " (" + "0 kg" + ")";
    }

    if (this.items.size() == 1) {
      return "1 item" + " (" + totalWeight() + " kg" + ")";
    }

    return this.items.size() + " items" + " (" + totalWeight() + " kg" + ")";
  }
}
