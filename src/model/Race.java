package model;

import java.util.Arrays;

public class Race {
    private Driver[] driver;
    private Circuits circuits;
    private Rail rail;

    //Getters and Setters
    public Driver[] getDriver() {
        return driver;
    }

    public void setDriver(Driver[] driver) {
        this.driver = driver;
    }

    public Circuits getCircuits() {
        return circuits;
    }

    public void setCircuits(Circuits circuits) {
        this.circuits = circuits;
    }

    public Rail getRail() {
        return rail;
    }

    public void setRail(Rail rail) {
        this.rail = rail;
    }

    //public method
    public void kmToMts(Circuits circuits) {
        double meters = circuits.getDistance() * 1000;
        circuits.setDistance(meters);
    }

    //builders
    public Race() {
    }

    public Race(Driver[] driver, Circuits circuits, Rail rail) {
        this.driver = driver;
        this.circuits = circuits;
        this.rail = rail;
    }

    @Override
    public String toString() {
        return "Race: \n" + Arrays.toString(driver) + "\n" + circuits + "\n" + rail;
    }
}
