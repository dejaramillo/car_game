package serviceDao;

import model.Podium;

import static serviceDao.PodiumCrud.createPodumWnner;
import static serviceDao.PodiumCrud.readPodium;

public class PoduimService {
    public static void createPodium(Podium podium){
        createPodumWnner(podium);
    }

    public static void readPodiumService(){
        readPodium();
    }
}
