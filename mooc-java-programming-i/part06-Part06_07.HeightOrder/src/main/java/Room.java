import java.util.ArrayList;

public class Room {

  private ArrayList<Person> persons;

  public Room() {
    this.persons = new ArrayList<>();
  }

  public void add(Person person) {
    this.persons.add(person);
  }

  public boolean isEmpty() {
    return persons.isEmpty();
  }

  public ArrayList<Person> getPersons() {
    return persons;
  }

  public Person shortest() {
    if (persons.isEmpty())
      return null;

    Person shortPerson = this.persons.get(0);

    for (Person person : persons) {
      if (person.getHeight() < shortPerson.getHeight()) {
        shortPerson = person;
      }
    }

    return shortPerson;
  }

  public Person take() {
    if (persons.isEmpty())
      return null;
    
    Person shortPerson = shortest();

    this.persons.remove(shortPerson);

    return shortPerson;
  }
}
