package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;

public class TextUI {

  private FlightControl flightControl;
  private Scanner scanner;

  public TextUI(FlightControl flightControl, Scanner scanner) {
    this.flightControl = flightControl;
    this.scanner = scanner;
  }

  public void start() {
    startAssetControl();
    System.out.println();
    startFlightControl();
    System.out.println();
  }

  private void startAssetControl() {
    System.out.println("Airport Asset Control");

    while (true) {
      System.out.println("Choose an action:");
      System.out.println("[1] Add an airplane");
      System.out.println("[2] Add a flight");
      System.out.println("[x] Exit Airport Asset Control");

      System.out.print("> ");
      String answer = scanner.nextLine();

      if (answer.equals("1")) {
        addAirplane();
      } else if (answer.equals("2")) {
        addFlight();
      } else if (answer.equals("x")) {
        break;
      }
    }
  }

  private void addAirplane() {
    System.out.print("Give the airplane id: ");
    String id = scanner.nextLine();

    System.out.print("Give the airplane capacity: ");
    int capacity = Integer.parseInt(scanner.nextLine());

    this.flightControl.addAirplane(id, capacity);
  }

  private void addFlight() {
    System.out.print("Give the airplane id: ");
    Airplane airplane = askForAirplane();

    System.out.print("Give the departure airport id: ");
    String departureID = scanner.nextLine();

    System.out.print("Give the target airport id: ");
    String destinationID = scanner.nextLine();

    this.flightControl.addFlight(airplane, departureID, destinationID);
  }

  private void startFlightControl() {
    System.out.println("Flight Control");

    while (true) {
      System.out.println("Choose an action:");
      System.out.println("[1] Print airplanes");
      System.out.println("[2] Print flights");
      System.out.println("[3] Print airplane details");
      System.out.println("[x] Quit");

      System.out.print("> ");
      String answer = scanner.nextLine();
      if (answer.equals("1")) {
        printAirplanes();
      } else if (answer.equals("2")) {
        printFlights();
      } else if (answer.equals("3")) {
        printAirplaneDetails();
      } else if (answer.equals("x")) {
        break;
      }
    }
  }

  private void printAirplanes() {
    flightControl.getAirplanes().stream().forEach(System.out::println);
  }

  private void printFlights() {
    flightControl.getFlights().stream().forEach(System.out::println);
  }

  private void printAirplaneDetails() {
    System.out.print("Give the airplane id: ");
    Airplane plane = askForAirplane();

    System.out.println(plane);
    System.out.println();
  }

  private Airplane askForAirplane() {
    Airplane airplane = null;

    do {
      System.out.print("Enter airplane ID: ");
      String id = scanner.nextLine();

      airplane = flightControl.getAirplane(id);

      if (airplane == null) {
        System.out.println("No airplane with the ID " + id + ".");
      }

    } while (airplane == null);

    return airplane;
  }
}
