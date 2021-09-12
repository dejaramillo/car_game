package model;

public class Rail {
    private static final int BASE_RAILS = 2;
    private int idRails;
    private int railsNumbers;

    //Getters and setters
    public int getIdRails() {
        return idRails;
    }

    public void setIdRails(int idRails) {
        this.idRails = idRails;
    }

    public int getRailsNumbers() {
        return railsNumbers;
    }

    public void setRailsNumbers(int railsNumbers) {
        this.railsNumbers = railsNumbers;
    }

    //Builders
    public Rail() {
        this(BASE_RAILS);
    }

    public Rail(int railsNumbers) {
        this.railsNumbers = railsNumbers;
    }

    @Override
    public String toString() {
        return "Rail: \n" +
                "railsNumbers=" + railsNumbers;
    }
}

