import java.util.ArrayList;
import java.util.List;

public class Statistics {

  private List<Integer> allPoints;
  private List<Integer> passPoints;
  private List<Integer> gradePoints;

  public Statistics() {
    this.allPoints = new ArrayList<>();
    this.passPoints = new ArrayList<>();
    this.gradePoints = new ArrayList<>();
  }

  public void addPoints(int point) {
    if (point > 0 && point <= 100) {
      allPoints.add(point);
    }

    if (point >= 50 && point <= 100) {
      passPoints.add(point);
    }
  }

  public void addGrade(int point) {
    gradePoints.add(point);
  }

  public void printGradeDistribution() {
    for (int grade = 5; grade >= 0; grade--) {
      int stars = countStars(grade);
      System.out.printf("%d: %s%n", grade, "*".repeat(stars));
    }
  }

  public double averagePoints(List<Integer> list) {
    if (list.isEmpty()) {
      return 0.0;
    }

    double sum = 0;
    for (Integer point : list) {
      sum += point;
    }

    return sum / list.size();
  }

  public double passPercentage() {
    return (double) passPoints.size() / allPoints.size() * 100;
  }

  private int countStars(int grade) {
    int stars = 0;

    for (int received : gradePoints) {
      if (received == grade)
        stars++;
    }

    return stars;
  }

  @Override
  public String toString() {
    return String.format("Point average (all): %.1f%n", averagePoints(allPoints))
        + String.format("Point average (passing): %.1f%n", averagePoints(passPoints))
        + "Pass percentage: " + passPercentage();
  }
}
