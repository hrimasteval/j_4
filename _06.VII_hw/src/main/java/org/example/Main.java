package org.example;

public class Main {
    public static void main(String[] args) {

        // Creating instances of different vehicles
        Vehicle vehicle = new Vehicle(50, 200);
        SportCar sportCar = new SportCar(60, 300);
        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(40, 150);
        Car car = new Car(70, 180);

        // Calling the drive method on each vehicle
        vehicle.drive(100);
        sportCar.drive(80);
        raceMotorcycle.drive(120);
        car.drive(150);
    }
}