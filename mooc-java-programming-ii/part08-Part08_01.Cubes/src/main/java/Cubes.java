
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) break;

            int cube = cube(Integer.parseInt(input));

            System.out.println(cube);
        }
    }

    public static int cube(int n) {
        return n * n * n;
    }
}
