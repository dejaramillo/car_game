package model;

public class Cars {
    private static int idvalidate;
    private int id;
    private String brand;
    private String color;

    //Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Builders
    public Cars() {
        this("Mercedez","Negro");
        this.idvalidate++;
        this.id = idvalidate;
    }

    public Cars(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.idvalidate++;
        this.id = idvalidate;
    }

    //public method

    @Override
    public String toString() {
        return "Car \n" +
                "id = " + id + "\n" +
                "brand = " + brand + "\n" +
                "color = " + color + "\n";
    }
}

