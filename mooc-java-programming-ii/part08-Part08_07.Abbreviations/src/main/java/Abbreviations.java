import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
  
  Map<String, String> abbreviations;

  public Abbreviations() {
    this.abbreviations = new HashMap<String, String>();
  }

  public void addAbbreviation(String abbreviation, String explanation) {
    this.abbreviations.put(abbreviation, explanation);
  }

  public boolean hasAbbreviation(String abbreviation) {
    return this.abbreviations.containsKey(abbreviation);
  }

  public String findExplanationFor(String abbreviation) {
    return this.abbreviations.get(abbreviation);
  }
}
