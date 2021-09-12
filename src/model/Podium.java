package model;

public class Podium {
    Driver firstPlace;
    Driver secondPlace;
    Driver thirdPlace;

    //Getters and setter
    public Driver getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(Driver firstPlace) {
        this.firstPlace = firstPlace;
    }

    public Driver getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(Driver secondPlace) {
        this.secondPlace = secondPlace;
    }

    public Driver getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(Driver thirdPlace) {
        this.thirdPlace = thirdPlace;
    }

    //Builders
    public Podium() {
    }

    public Podium(Driver firstPlace, Driver secondPlace, Driver thirdPlace) {
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
    }

    @Override
    public String toString() {
        return "Podium: \n" +
                "firstPlace = " + firstPlace + "\n" +
                "secondPlace =" + secondPlace + "\n" +
                "thirdPlace =" + thirdPlace;
    }
}
