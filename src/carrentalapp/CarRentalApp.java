/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalapp;
import java.util.Scanner;

public class CarRentalApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of passengers: ");
        int passengers = scanner.nextInt();

        System.out.print("Number of rental days: ");
        int days = scanner.nextInt();

        System.out.print("Trip mileage: ");
        double mileage = scanner.nextDouble();

        if(passengers <=0 || passengers >7 ||
           days <=0 || mileage <=0){

            System.out.println("Invalid input.");
            return;
        }

        CarRepository repo = new CarRepository();
        CarSelector selector = new CarSelector();

        Car bestCar = selector.findBestCar(repo.getCars(), passengers, days, mileage);

        if(bestCar != null){
         
      System.out.println("----------------------------------------------");
       System.out.println("\nBest Car: " + bestCar.getCarInfo());
       System.out.println("Max Passengers: " + bestCar.getMaxPassengers());

       double totalCost = bestCar.calculateTripCost(days, mileage);
            System.out.printf("Total Cost: $%.2f\n", totalCost);
        }
        else{
            System.out.println("No suitable car found.");
        }

        scanner.close();
    }
}


