package FlightControl.domain;

public class Place {

  private String ID;

  public Place(String iD) {
    ID = iD;
  }
  
  @Override
  public String toString() {
    return this.ID;
  }
}
