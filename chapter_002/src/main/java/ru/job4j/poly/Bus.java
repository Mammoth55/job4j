package ru.job4j.poly;

public class Bus implements Transport {

    private double fuelTank;
    private int passengers;
    private boolean isMoving;

    public Bus(double fuelTank, int passengers, boolean isMoving) {
        this.fuelTank = fuelTank;
        this.passengers = passengers;
        this.isMoving = isMoving;
    }

    @Override
    public void go() {
        this.passengers = 1;
        this.isMoving = true;
    }

    @Override
    public void passengers(int passengers) {
        this.passengers += passengers;
    }

    @Override
    public double fillUp(double fuel) {
        this.fuelTank += fuel;
        return this.fuelTank;
    }
}
