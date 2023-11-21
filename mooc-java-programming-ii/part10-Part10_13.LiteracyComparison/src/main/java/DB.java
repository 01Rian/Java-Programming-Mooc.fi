public class DB implements Comparable<DB> {

  private String country;
  private Integer year;
  private String gender;
  private Double ratio;

  public DB(String country, Integer year, String gender, Double ratio) {
    this.country = country;
    this.year = year;
    this.gender = gender;
    this.ratio = ratio;
  }

  public String getCountry() {
    return country;
  }

  public Integer getYear() {
    return year;
  }

  public String getGender() {
    return gender;
  }

  public Double getRatio() {
    return ratio;
  }

  @Override
  public String toString() {
    return getCountry() + " (" + getYear() + ")" + "," + getGender() + ", " + getRatio();
  }

  @Override
  public int compareTo(DB o) {
    if (this.getRatio() == o.getRatio()) {
      return 0;
    } else if (this.getRatio() > o.getRatio()) {
      return 1;
    } else {
      return -1;
    }
  }
}
