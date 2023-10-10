
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        }

        String eleString = "";

        if (this.elements.size() == 1) {
            return printOutput + " has " + this.elements.size() + " element:\n" + this.elements.get(0);
        } else {
            for (String element : this.elements) {
                eleString += element + "\n";
            }
        }

        return printOutput + " has " + this.elements.size() + " elements:\n" + eleString;
    }
}
