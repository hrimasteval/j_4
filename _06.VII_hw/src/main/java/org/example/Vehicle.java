package org.example;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;                  // importing values
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public double getDefaultFuelConsumption() {                                   // DFC getter (no setter)
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {                                          // fuelConsumption getter
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {                      // fuelConsumption setter
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {                                                     // fuel getter
        return fuel;
    }

    public void setFuel(double fuel) {                                            // fuel setter
        this.fuel = fuel;
    }

    public int getHorsePower() {                                                  // horsePower getter
        return horsePower;
    }

    public void setHorsePower(int horsePower) {                                   // horsePower setter
        this.horsePower = horsePower;
    }

    public Vehicle(double fuel, int horsePower) {                                 // constructor
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public void drive(double km) {                                                // void drive
        double fuelNeeded = km * fuelConsumption;
        if (fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
            System.out.println("drove " + km + " km.");
        } else {
            System.out.println("not enough fuel to drive " + km + " km.");
        }
    }
}