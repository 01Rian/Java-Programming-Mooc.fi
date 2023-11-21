import java.util.HashMap;

public class IOU {
  
  private HashMap<String, Double> sum;

  public IOU() {
    this.sum = new HashMap<>();
  }

  public void setSum(String toWhom, double amount) {
    this.sum.put(toWhom, amount);
  }

  public double howMuchDoIOweTo(String toWhom) {
    return sum.getOrDefault(toWhom, 0.0);
  }
}
