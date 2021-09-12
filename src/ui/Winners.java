package ui;
import static serviceDao.PoduimService.createPodium;
import model.Driver;
import model.Podium;

public class Winners {
    /**
     * winners - add players to the podium
     * @param driver object with win player
     * @param podium integer that shows when the player reaches the finish line
     * @param podiums object type podium with the places to be assigned
     */
    public static void winners(Driver driver, int podium, Podium podiums){
        if (podium == 1){
            podiums.setFirstPlace(driver);
        }else if (podium == 2){
            podiums.setSecondPlace(driver);
        }else if (podium == 3){
            podiums.setThirdPlace(driver);
            System.out.println(podiums);
            createPodium(podiums);
        }

    }
}
