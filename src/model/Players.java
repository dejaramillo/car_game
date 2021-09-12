package model;

public class Players {
    private int playerId;
    private String name;
    private String userName;

    //Getters and Setters
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //builders
    public Players() {
    }

    public Players(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    //Override  to string method

    @Override
    public String toString() {
        return "name = " + name + "\n" + "userName = " + userName + "\n";
    }
}
