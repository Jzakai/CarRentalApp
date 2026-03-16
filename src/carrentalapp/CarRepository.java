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

public class CarRepository {

    private ArrayList<Car> cars;

    public CarRepository() {

        cars = new ArrayList<>();

        cars.add(new Car("Coupe","Economy",4,45,35,"Poor","Honda","Civic"));

        cars.add(new Car("Sedan","Intermediate",4,50,32,"Medium","Toyota","Corolla"));

        cars.add(new Car("Hybrid","Intermediate",4,50,50,"Medium","Toyota","Prius"));

        cars.add(new Car("SUV","Standard",5,55,28,"Good","Toyota","RAV4"));

        cars.add(new Car("Crossover","Standard",5,55,27,"Good","Mazda","CX5"));

        cars.add(new Car("Truck","Standard",5,55,22,"Good","Ford","F150"));

        cars.add(new Car("Van/Minivan","Van",7,70,18,"Medium","Chrysler","Pacifica"));
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}