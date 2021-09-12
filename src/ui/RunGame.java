package ui;

import model.Driver;
import model.Race;

import static ui.RuningRace.runingRace;

public class RunGame {
    /**
     * runGame - function that assigns each driver to a lane
     * @param race object with race data
     */
    public static void runGame(Race race) {
        Driver[] positionDrivers = new Driver[race.getRail().getRailsNumbers()];
        double[] distanceForRail = new double[race.getRail().getRailsNumbers()];
        for (int i = 0; i < positionDrivers.length; i++) {
            positionDrivers[i] = race.getDriver()[i];
            distanceForRail[i] = race.getCircuits().getDistance();
        }
        runingRace(positionDrivers,distanceForRail);
    }
}
