package ui;


import static ui.PlayerMenu.playerMenu;
import static ui.PlayerMenu.createPlayer;

import model.Driver;

import java.util.Scanner;

public class Customize {
    /**
     * customize - customize the player, create the driver for the race, with the car for racing
     * @param drivers - array of object with number of players
     * @return - the array of objects with the driver's data
     */
    public static Driver[] customize(Driver[] drivers) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String userName = null;
        int validate = 0;
        int response = 0;
        for (int i = 0; i < drivers.length; i++) {
            drivers[i] = new Driver();
            do {
                validate = 0;
                System.out.println("*******************");
                System.out.println("*Player: " + (i + 1) + "        *");
                System.out.println("*******************");
                System.out.println("1.Seleccionar piloto");
                System.out.println("2.Crear Piloto");
                response = sc.nextInt();
                switch (response) {
                    case 1:
                        drivers[i] = playerMenu(drivers[i]);
                        break;
                    case 2:
                        drivers[i] = createPlayer(drivers[i]);
                        break;
                }
                if (response < 1 || response > 2) {
                    System.out.println("Seleccione la opcion correcta");
                }else {
                    //validates that the driver is not repeated
                    for (int j = 0; j < PlayerMenu.validate1 - 1; j++) {
                        if (j != i) {
                            if (drivers[j].getUserName().equals(drivers[i].getUserName())) {
                                validate = 1;
                                PlayerMenu.validate1 -= 1;
                                System.out.println("El piloto " + drivers[i].getUserName() + " ya fue seleccionado" + "\n Seleccione nuevamente");
                            }
                        }
                    }
                }
            } while (validate == 1 || response < 1 || response > 2);
        }
        System.out.println("Pilotos Seleccionados");
        System.out.println("---------------------");
        for (int i = 0; i < drivers.length; i++) {
            System.out.println(drivers[i]);
            System.out.println("********************");
        }
        return drivers;
    }
}
