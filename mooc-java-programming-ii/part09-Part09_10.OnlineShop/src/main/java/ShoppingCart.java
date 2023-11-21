import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

  private Map<String, Item> items;

  public ShoppingCart() {
    this.items = new HashMap<>();
  }

  public void add(String product, int price) {
    if (items.containsKey(product)) {
      items.get(product).increaseQuantity();
    } else {
      items.put(product, new Item(product, 1, price));
    }
  }

  public int price() {
    return this.items.values().stream()
        .mapToInt(Item::price)
        .sum();
  }

  public void print() {
    items.values().forEach(item -> System.out.println(item));
  }
}
