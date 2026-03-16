/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalapp;

/**
 *
 * @author janaz
 */
import java.util.ArrayList;

public class CarSelector {

    public Car findBestCar(ArrayList<Car> cars, int passengers, int days, double mileage) {

        double bestCost = Double.MAX_VALUE;
        Car bestCar = null;

        for(Car car : cars){

            if(!car.fitsPassengers(passengers))
                continue;

            double cost = car.calculateTripCost(days, mileage);

            if(cost < bestCost){
                bestCost = cost;
                bestCar = car;
            }

            else if(cost == bestCost &&
                    car.getComfortScore() > bestCar.getComfortScore()){

                bestCar = car;
            }
        }

        return bestCar;
    }
}