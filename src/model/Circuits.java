package model;


public class Circuits extends Runway {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //builders
    public Circuits() {
    }

    public Circuits(double distance, String name) {
        super(distance);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circuits \n" +
                "name= " + name + "\n" +
                super.toString();
    }
}
