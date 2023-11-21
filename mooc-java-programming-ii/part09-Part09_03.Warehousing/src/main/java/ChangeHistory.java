import java.util.ArrayList;
import java.util.OptionalDouble;

public class ChangeHistory {

  private ArrayList<Double> history = new ArrayList<>();

  public ChangeHistory() {
  };

  public void add(double status) {
    history.add(status);
  }

  public void clear() {
    history.clear();
  }

  public double maxValue() {
    if (history.isEmpty()) {
      return 0.0;
    }

    return history.stream()
        .reduce(Double::max)
        .get();
  }

  public double minValue() {
    if (history.isEmpty()) {
      return 0.0;
    }

    return history.stream()
        .reduce(Double::min)
        .get();
  }

  public double average() {
    if (history.isEmpty()) {
      return 0.0;
    }

    OptionalDouble average = history.stream()
        .mapToDouble(Double::doubleValue)
        .average();

    return average.getAsDouble();
  }

  @Override
  public String toString() {
    return history.toString();
  }
}
