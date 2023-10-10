import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("duration: ");
            String duration = scanner.nextLine();
            
            programs.add(new TelevisionProgram(name, Integer.valueOf(duration)));
        }

        System.out.println("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram televisionProgram : programs) {
            if (televisionProgram.getDuration() <= maxDuration) {
                System.out.println(televisionProgram);
            }
        }
        
        scanner.close();
    }
}
