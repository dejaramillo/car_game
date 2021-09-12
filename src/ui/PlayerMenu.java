package ui;
import static serviceDao.PlayersCRUD.readPlayer;
import static serviceDao.PlayersCRUD.showDriverMenu;
import static serviceDao.PlayersService.createPlayers;
import static ui.CarMenu.carMenu;

import model.Driver;

import java.util.Scanner;

public class PlayerMenu {
    public static int validate1 = 0;

    /**
     * playerMenu -  function that selects a driver from the database
     * @param driver object to insert data
     * @return driver object whith inserted data
     */
    public static Driver playerMenu(Driver driver){
        Driver[] drivers = validateArrayDriver();
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int i = 0;
        do {
            System.out.println("Pilotos Registrados");
            System.out.println("-------------------");
            readPlayer();
            System.out.println("Selecciona un piloto");
            index = sc.nextInt();
            if (index < 1 || index > drivers.length){
                System.out.println("Seleccione el piloto correcto");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }else {
                while (i < index - 1 ) { i++; }
                Driver driver1 = validateArrayDriver()[i];
                driver.setName(driver1.getName());
                driver.setUserName(driver1.getUserName());
            }
        }while (index < 1 || index > drivers.length);
        driver.setPlayerCar(carMenu());
        validate1++;
    return driver;
    }

    /**
     * validateArrayDriver - function that validates the data in the database array
     * @return array object object without null data
     */
    private static Driver[] validateArrayDriver(){
        Driver[] driversDB = showDriverMenu();
        int count = 0;
        for (int i = 0; i < driversDB.length; i++) {
            if (driversDB[i] == null){
                break;
            }
            count++;
        }
        Driver[] drivers = new  Driver[count];
        for (int i = 0; i < drivers.length ; i++) {
            drivers[i] = driversDB[i];
        }

        return drivers;
    }

    /**
     * createPlayer - function that creates a player in the database
     * @param driver - empty object
     * @return object with player created
     */
    public static Driver createPlayer(Driver driver){
        driver = createPlayers(driver);
        driver.setPlayerCar(carMenu());
        return driver;
    }
}
