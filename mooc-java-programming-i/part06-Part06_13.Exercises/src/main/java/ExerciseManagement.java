import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

  private List<Exercise> exercises;

  public ExerciseManagement() {
    this.exercises = new ArrayList<>();
  }

  public List<String> exerciseList() {
    List<String> exerciseList = new ArrayList<>();

    for (Exercise exercise : exercises) {
      exerciseList.add(exercise.getName());
    }

    return exerciseList;
  }

  public void add(String exercise) {
    this.exercises.add(new Exercise(exercise));
  }

  public void markAsCompleted(String exercise) {
    for (Exercise ex : exercises) {
      if (ex.getName().equals(exercise))
        ex.setCompleted(true);
    }
  }

  public boolean isCompleted(String exercise) {
    for (Exercise ex : exercises) {
      if (ex.getName().equals(exercise))
        return ex.isCompleted();
    }

    return false;
  }
}
