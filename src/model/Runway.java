package model;

public abstract class Runway {
    private double distance;

    //Getters and setters
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    //Builders
    public Runway(){}

    public Runway(double distance) {
        this.distance = distance;
    }



    @Override
    public String toString() {
        return "Distance=" + distance + " Mts.";
    }
}
