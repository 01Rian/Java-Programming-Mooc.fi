
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room r = new Room();
Person first = new Person("first", 1);

r.add(first);
System.out.println(r.isEmpty());

Person shortestPerson = r.take();
System.out.println(r.isEmpty());
    }
}
