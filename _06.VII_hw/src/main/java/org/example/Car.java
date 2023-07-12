package org.example;

public class Car {
    private static final double DEFAULT_FUEL_CONSUMPTION = 3.0;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Car(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double km) {
        double fuelNeeded = km * fuelConsumption;
        if (fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
            System.out.println("drove " + km + " km.");
        } else {
            System.out.println("not enough fuel to drive " + km + " km.");
        }
    }
}