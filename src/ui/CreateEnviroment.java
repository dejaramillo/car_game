package ui;

import model.Circuits;
import model.Driver;
import model.Race;
import model.Rail;

import static ui.Customize.customize;
import static ui.SelectCircuit.selectCircuit;
import static ui.SelectRailsNumber.selectRailsNumber;

import java.util.Scanner;

public class CreateEnviroment {
    /**
     * createEnviroment menu to create the whole enviroment for the race (driver,rail and ciruit)
     *
     * @return
     */
    public static Race createEnviroment() {
        Race race = new Race();
        Circuits circuit = new Circuits();
        Rail rail = new Rail();
        Scanner sc = new Scanner(System.in);
        int response = 0;
        int numberPlayers = 0;
        do {
            System.out.println("1.Ingresar Jugadores");
            System.out.println("2.Volver Al Menu principal");
            response = sc.nextInt();
            switch (response){
                case 1:
                   numberPlayers = menuEnviroment();
                   response =2;
                    break;
                case 2:
                    return null;
                default:
                    System.out.println("Ingrese la opcion correcta");
            }
        }while (response != 2);
        Driver[] drivers = new Driver[numberPlayers];
        drivers = customize(drivers);
        circuit = selectCircuit(circuit);
        rail = selectRailsNumber(drivers);
        race.setDriver(drivers);
        race.setCircuits(circuit);
        race.kmToMts(circuit);
        race.setRail(rail);
        return  race;
    }

    /**
     * menu enviroment - validates the number of players
     * @return - interger value wiht number of players
     */
    public static int menuEnviroment(){
        Scanner sc = new Scanner(System.in);
        int numberPlayers = 0;
        do {
            System.out.println("Ingrese el numero de jugadores [MIN 3 - MAX 8]");
            numberPlayers = sc.nextInt();
            if (numberPlayers < 3 || numberPlayers > 8)
                System.out.println("Numero incorrecto de jugadores. \ningrese los jugadores de nuevo");
        } while (numberPlayers < 3 || numberPlayers > 8);
        return numberPlayers;
    }
}

