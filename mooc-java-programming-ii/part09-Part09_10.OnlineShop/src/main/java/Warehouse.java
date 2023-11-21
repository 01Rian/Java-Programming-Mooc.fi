import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

  private Map<String, Integer> products;
  private Map<String, Integer> stocks;

  public Warehouse() {
    this.products = new HashMap<>();
    this.stocks = new HashMap<>();
  }

  public void addProduct(String product, int price, int stock) {
    products.put(product, price);
    stocks.put(product, stock);
  }

  public int price(String product) {
    if (!this.products.containsKey(product))
      return -99;

    return products.get(product);
  }

  public int stock(String product) {
    if (!this.stocks.containsKey(product))
      return 0;

    return stocks.get(product);
  }

  public boolean take(String product) {
    if (stocks.containsKey(product)) {
      int currentStock = stocks.get(product);

      if (currentStock > 0) {
        stocks.put(product, currentStock - 1);
        return true;
      }
    }

    return false;
  }

  public Set<String> products() {
    return this.products.keySet();
  }
}
