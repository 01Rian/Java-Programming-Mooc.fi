package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

  private boolean sensor;

  public TemperatureSensor() {
    this.sensor = false;
  }

  @Override
  public boolean isOn() {
    return sensor;
  }

  @Override
  public void setOn() {
    this.sensor = true;
  }

  @Override
  public void setOff() {
    this.sensor = false;
  }

  @Override
  public int read() {
    if (sensor == false) {
      throw new IllegalStateException("Error Temperature Sensor");
    }

    return new Random().nextInt(61) - 30;
  }
}
