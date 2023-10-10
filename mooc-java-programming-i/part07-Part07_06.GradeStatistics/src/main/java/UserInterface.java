import java.util.Scanner;

public class UserInterface {

  private final Statistics stats;
  private final Scanner scanner;

  public UserInterface(Statistics stats, Scanner scanner) {
    this.scanner = scanner;
    this.stats = stats;
  }

  public void start() {
    System.out.println("Enter point totals, -1 stops: ");
    
    while (true) {
      String point = scanner.nextLine();

      if (point.equals("-1")) {
        break;
      }

      int score = Integer.parseInt(point);

      stats.addPoints(score);

      if (score < 0 || score > 100) {
        continue;
      }

      int gradePoint = handleGrade(score);

      stats.addGrade(gradePoint);
    }

    System.out.println(stats);
    System.out.println("Grade distribution:");
    stats.printGradeDistribution();
  }

  public int handleGrade(int score) {
    int gradePoint;

    if (score < 50) {
      gradePoint = 0;
    } else if (score < 60) {
      gradePoint = 1;
    } else if (score < 70) {
      gradePoint = 2;
    } else if (score < 80) {
      gradePoint = 3;
    } else if (score < 90) {
      gradePoint = 4;
    } else {
      gradePoint = 5;
    }

    return gradePoint;
  }
}
