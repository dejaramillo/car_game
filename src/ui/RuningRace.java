package ui;

import model.Driver;
import model.Podium;

import static ui.Winners.winners;
import static ui.ShowResult.showResultRace;
import java.util.Scanner;

import static ui.Route.route;

public class RuningRace {
    /**
     * runingRace - function that manages each player's units
     * @param drivers - array object whit date of players
     * @param railsDistance - rails for players
     */
    public static void runingRace(Driver[] drivers, double[] railsDistance) {
        Podium podiums = new Podium();
        Scanner sc = new Scanner(System.in);
        int rollDice = 0;
        int dice = 0;
        int count = 0;
        int podium = 1;
        do {
            count = 0;
            for (int i = 0; i < drivers.length; i++) {
                if (railsDistance[i] == 0){
                    continue;
                }else {
                    rollDice = validateTurn(i);
                }
                switch (rollDice) {
                    case 1:
                        railsDistance[i] = route(railsDistance[i], drivers[i]);
                        break;
                    case 2:
                        break;
                }
                if (railsDistance[i] == 0 && podium <= 3) {
                    winners(drivers[i], podium,podiums);
                    podium++;
                }
            }
            showResultRace(drivers,railsDistance);
            for (int j = 0; j < railsDistance.length; j++) {
                count += railsDistance[j];
            }
        } while (count != 0);
    }

    /**
     * function that validates the player's choice
     * @param i player index
     * @return correct selection
     */
    public static int validateTurn(int i){
        Scanner sc = new Scanner(System.in);
        int rollDice = 0;
        do {
            System.out.println("*****************");
            System.out.println("*Turno Player: " + (i + 1) + "*");
            System.out.println("*****************");
            System.out.println("1.Acelerar");
            System.out.println("2.Pasar turno");
            rollDice = sc.nextInt();
            if (rollDice < 1 || rollDice > 2)
                System.out.println("Seleccion incorrecta " + "\n*************************"+ "\nRepita el turno");
        }while (rollDice < 1 || rollDice > 2);
        return rollDice;
    }
}
