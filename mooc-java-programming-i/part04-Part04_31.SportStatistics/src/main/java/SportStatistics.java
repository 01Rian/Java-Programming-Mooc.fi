
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File: ");
        String file = scan.nextLine();

        System.out.print("Team: ");
        String team = scan.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            int countGame = 0;
            int wins = 0;
            int losses = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");

                if (parts[0].equals(team) || parts[1].equals(team)) {
                    
                    if (parts[0].equals(team) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        wins = wins + 1;
                    } else if (parts[1].equals(team) && Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        wins = wins + 1;
                    } else {
                        losses = losses + 1;
                    }

                    countGame = countGame + 1;
                }
            }

            System.out.println("Games: " + countGame);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
