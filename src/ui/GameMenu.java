package ui;


import model.Race;

import static serviceDao.PoduimService.readPodiumService;
import static ui.CreateEnviroment.createEnviroment;
import static ui.CustomizeCircuit.customizeCircuit;
import static ui.RunGame.runGame;
import static ui.TextForGame.GameTitle.gameTitle;
import java.util.Scanner;

public class GameMenu {
    /**
     * showGameMenu - function that show principal menu
     */
    public static void showGameMenu() {
        Race race =  new Race();
        Scanner sc = new Scanner(System.in);
        int response = 0;
        do {
            gameTitle();
            response = sc.nextInt();
            switch (response) {
                case 1:
                   race = createEnviroment();
                   if (race != null)
                       runGame(race);
                    break;
                case 2:
                    readPodiumService();
                    break;
                case 3:
                    customizeCircuit();
                    break;
                case 4:
                    System.out.println("Saliendo del Juego");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (response != 4);
    }
}
