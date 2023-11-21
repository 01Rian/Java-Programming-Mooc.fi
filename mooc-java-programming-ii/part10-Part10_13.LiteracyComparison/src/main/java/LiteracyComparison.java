
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        read("literacy.csv");
    }

    public static void read(String file) {
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.trim().split(","))
                    .map(parts -> new DB(parts[3], Integer.parseInt(parts[4]), parts[2].replaceAll(" \\(%\\)", ""), Double.parseDouble(parts[5])))
                    .sorted()
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
