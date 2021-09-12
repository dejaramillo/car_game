package ui;

import model.Driver;

public class ShowResult {
    /**
     * showResultRace - function that show race reslut for lap
     * @param drivers array object type driver with players
     * @param raildistance array double with distance for rail
     */
    public static void showResultRace(Driver[] drivers, double[] raildistance){
        for (int i = 0; i <= drivers.length - 1; i++){
            if (raildistance[i] != 0) {
                System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
                System.out.println("▄▀▄  Piloto " + drivers[i].getUserName() +" ▄▀▄ Meta "+  raildistance[i] + " Mts  ▄▀▄");
                System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
            }
        }
    }
}
