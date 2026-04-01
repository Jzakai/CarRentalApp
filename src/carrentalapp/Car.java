/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalapp;



public class Car {

    private String category;
    private String type;
    private int maxPassengers;
    private double costPerDay;
    private double mpg;
    private String comfort;
    private String make;
    private String model;

    public Car(String category, String type, int maxPassengers,
               double costPerDay, double mpg, String comfort,
               String make, String model) {

        this.category = category;
        this.type = type;
        this.maxPassengers = maxPassengers;
        this.costPerDay = costPerDay;
        this.mpg = mpg;
        this.comfort = comfort;
        this.make = make;
        this.model = model;
    }

    public boolean fitsPassengers(int passengers) {
        return passengers <= maxPassengers;
    }

    public double calculateTripCost(int days, double mileage) {

        double rentalCost = days * costPerDay;
        double fuelCost = (mileage / mpg) * 2.25;

        return rentalCost + fuelCost;
    }

    public int getComfortScore() {

        if (comfort.equalsIgnoreCase("Good")) return 3;
        if (comfort.equalsIgnoreCase("Medium")) return 2;
        return 1;
    }

    public String getCarInfo() {
        return make + " " + model + " (" + category + ")";
    }
    public int getMaxPassengers() {
    return maxPassengers;
}
}