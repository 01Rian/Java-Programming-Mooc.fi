import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeManager {

  private List<String> jokeList;

  public JokeManager() {
    this.jokeList = new ArrayList<String>();
  }

  public void addJoke(String joke) {
    this.jokeList.add(joke);
  }

  public String drawJoke() {
    if (this.jokeList.isEmpty())
      return "Jokes are in short supply.";

    Random rand = new Random();
    int randomIndex = rand.nextInt(jokeList.size());

    String randomJoke = jokeList.get(randomIndex);

    return randomJoke;
  }

  public void printJokes() {
    jokeList.stream()
        .forEach(s -> System.out.println(s));
  }
}
