import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

  private List<Person> persons;

  public Employees() {
    this.persons = new ArrayList<>();
  }

  public void add(Person personToAdd) {
    this.persons.add(personToAdd);
  }

  public void add(List<Person> peopleToAdd) {
    this.persons = peopleToAdd;
  }

  public void print() {
    Iterator<Person> it = persons.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public void print(Education education) {
    Iterator<Person> it = persons.iterator();

    while (it.hasNext()) {
      Person person = it.next();
      if (person.getEducation() == education) {
        System.out.println(person);
      }
    }
  }

  public void fire(Education education) {
    Iterator<Person> it = persons.iterator();

    while (it.hasNext()) {
      if (it.next().getEducation() == education) {
        it.remove();
      }
    }
  }
}
