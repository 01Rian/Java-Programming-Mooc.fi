import java.util.ArrayList;
import java.util.List;

public class Database {
  
  private List<Bird> birds;

  public Database() {
    this.birds = new ArrayList<>();
  }

  public void addBird(Bird bird) {
    this.birds.add(bird);
  }

  public List<Bird> getBirds() {
    return birds;
  }
}
