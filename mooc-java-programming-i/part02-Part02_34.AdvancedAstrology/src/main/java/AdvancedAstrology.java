
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";

        for (int i = 0; i < number; i++) {
            stars += "*";
        }

        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }  
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int newSize = size;
        for (int i = 1; i <= size; i++) {
            printSpaces(newSize - 1);
            printStars(i);
            newSize--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int newHeight = height;
        for (int i = 1; i <= height; i++) {
            printSpaces(newHeight - 1);
            printStars(i * 2 - 1);
            newHeight--;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printTriangle(5);
        //System.out.println("---");
        christmasTree(10);
        //System.out.println("---");
        //christmasTree(10);
    }
}
