import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                int amountToAdd = Integer.parseInt(parts[1]);

                if (amountToAdd > 0) {
                    if (firstContainer + amountToAdd <= 100) {
                        firstContainer += amountToAdd;
                    } else {
                        firstContainer = 100;
                    }
                }
            }

            if (parts[0].equals("move")) {
                int amountToMove = Integer.parseInt(parts[1]);

                if (amountToMove > 0) {
                    if (firstContainer >= amountToMove) {
                        if (secondContainer + amountToMove <= 100) {
                            firstContainer -= amountToMove;
                            secondContainer += amountToMove;
                        } else {
                            firstContainer -= (100 - secondContainer);
                            secondContainer = 100;
                        }
                    } else {
                        if (secondContainer + firstContainer <= 100) {
                            secondContainer += firstContainer;
                            firstContainer = 0;
                        } else {
                            secondContainer = 100;
                        }
                    }
                }
            }

            if (parts[0].equals("remove")) {
                int amountToRemove = Integer.parseInt(parts[1]);

                if (amountToRemove > 0) {
                    if (secondContainer >= amountToRemove) {
                        secondContainer -= amountToRemove;
                    } else {
                        secondContainer = 0;
                    }
                }
            }
        }
    }
}