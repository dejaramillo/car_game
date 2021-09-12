package ui;

import model.Driver;
import model.Rail;

public class SelectRailsNumber {
    /**
     * selectRailsNumber - create the number of rails for the race
     * @param drivers array with number of players for create rails
     * @return object type rail with number of rails
     */
    public static Rail selectRailsNumber(Driver[] drivers){
        Rail rail = new Rail();
        int count = 0;
        for (int i = 0; i < drivers.length; i++) {
            count++;
        }
        rail.setRailsNumbers(count);
        return rail;
    }
}
