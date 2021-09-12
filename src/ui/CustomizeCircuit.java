package ui;

import java.util.Scanner;

import static serviceDao.circuitService.*;

public class CustomizeCircuit {
    /**
     * customizeCircuit - function  that show CRUD circuit menu
     */
    public static void customizeCircuit() {
        Scanner sc = new Scanner(System.in);
        int response = 0;
        do {
            System.out.println("1.Nuevo Circuito");
            System.out.println("2.Ver Circuitos Disponibles");
            System.out.println("3.Editar Circuito");
            System.out.println("4.Borrar Circuito");
            System.out.println("5.Volver al menu principal");
            response = sc.nextInt();
            switch (response) {
                case 1:
                    serviceCreateCircuit();
                    break;
                case 2:
                    serviceReadCircuit();
                    break;
                case 3:
                    serviceUpdateCircuit();
                    break;
                case 4:
                    serviceDeleteCircuits();
                    break;
            }
        }while (response != 5);
    }

}
