package serviceDao;


import model.Driver;

import java.util.Scanner;

public class PlayersService {
    /**
     * createPlayer - players create wizard
     * @param driver object for save
     * @return this return is a function of continuing the game process.
     */
    public static Driver createPlayers(Driver driver){
        int validate = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingresar Nombre");
            String name = sc.nextLine();
            System.out.println("Ingrese su nombre de usuario para la competencia");
            String userName = sc.nextLine();
            driver.setName(name);
            driver.setUserName(userName);
            validate = validateNumber(PlayersCRUD.validateUserName(), userName);
            if (validate == 1){
                System.out.println("El nombre de usuario no esta disponible");
            }
        }while (validate == 1);
        PlayersCRUD.createPlayer(driver);
        return driver;
    }

    /**
     * validateNumbers - function that compares the new user name with the ones in the database
     * @param userNames - string array witth all user names of data base
     * @param userName new user name for save
     * @return number 1 if  repeated and 0 success
     */
    public static int validateNumber(String[] userNames,String userName){
        for (int i = 0; i < userNames.length; i++) {
            if (userName.equals(userNames[i])){
                return 1;
            }
        }
        return 0;
    }
}
