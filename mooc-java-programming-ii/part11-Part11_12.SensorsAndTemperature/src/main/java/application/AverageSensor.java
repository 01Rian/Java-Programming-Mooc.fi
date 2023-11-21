package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

  private List<Sensor> sensors;
  private List<Integer> allReadings;

  public AverageSensor() {
    this.sensors = new ArrayList<>();
    this.allReadings = new ArrayList<>();
  }

  public void addSensor(Sensor toAdd) {
    this.sensors.add(toAdd);
  }

  public List<Integer> readings() {
    return new ArrayList<>(allReadings);
  }

  @Override
  public boolean isOn() {
    boolean isOn = this.sensors.stream().allMatch(Sensor::isOn);
    
    return isOn;
  }

  @Override
  public void setOn() {
    this.sensors.stream().forEach(Sensor::setOn);
  }

  @Override
  public void setOff() {
    this.sensors.stream().forEach(Sensor::setOff);
  }

  @Override
  public int read() {
    if (isOn() == false || this.sensors.isEmpty()) {
      throw new IllegalStateException("Error Average Sensor");
    }

    int reading = (int) this.sensors.stream()
        .mapToInt(Sensor::read)
        .average()
        .orElse(0);

    allReadings.add(reading);

    return reading;
  }
}
