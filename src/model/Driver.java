package model;

public class Driver extends Players {
    Cars playerCar;

    //Getters and setters
    public Cars getPlayerCar() {
        return playerCar;
    }

    public void setPlayerCar(Cars playerCar) {
        this.playerCar = playerCar;
    }

    //builders
    public Driver() {
    }
    public Driver(String name, String userName, Cars playerCar) {
        super(name, userName);
        this.playerCar = playerCar;
    }


    @Override
    public String toString() {
        return "Driver: \n" +
                super.toString()+ playerCar;
    }

}
