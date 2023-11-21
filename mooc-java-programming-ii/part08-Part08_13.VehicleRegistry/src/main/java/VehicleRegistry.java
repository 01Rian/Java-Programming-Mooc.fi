import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {
  
  private HashMap<LicensePlate, String> licenses;

  public VehicleRegistry() {
    this.licenses = new HashMap<>();
  };

  public boolean add(LicensePlate licensePlate, String owner) {
    if (!licenses.containsKey(licensePlate)) {
      licenses.put(licensePlate, owner);
      return true;
    }

    return false;
  }

  public String get(LicensePlate licensePlate) {
    return licenses.get(licensePlate);
  }

  public boolean remove(LicensePlate licensePlate) {
    if (licenses.containsKey(licensePlate)) {
      licenses.remove(licensePlate);
      return true;
    }

    return false;
  }

  public void printLicensePlates() {
    for (LicensePlate plate : licenses.keySet()) {
      System.out.println(plate);
    }
  }

  public void printOwners() {
    List<String> owners = new ArrayList<>();

    for (String owner : licenses.values()) {
      if (!owners.contains(owner)) {
        System.out.println(owner);
      }

      owners.add(owner);
    }
  }
}
