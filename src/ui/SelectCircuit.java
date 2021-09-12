package ui;


import static serviceDao.circuitService.serviceReadCircuit;
import static serviceDao.circuitsCRUD.showCircuitsMenu;

import model.Circuits;



import java.util.Scanner;

public class SelectCircuit {
    /**
     * selectCircuit - function that
     * @return
     */
    public static Circuits selectCircuit(Circuits circuit){
        Circuits[] circuits = validateArrayCircuit();
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int i = 0;
        do {
            System.out.println("Circuitos disponibles");
            serviceReadCircuit();
            System.out.println("************************");
            System.out.println("Seleccionar Circuito");
            index = sc.nextInt();
            if (index < 1 || index > circuits.length){
                System.out.println("Seleccione el circuito correcto");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }else {
                while (i < index - 1) { i++; }
                Circuits circuits1 = validateArrayCircuit()[i];
                circuit.setName(circuits1.getName());
                circuit.setDistance(circuits1.getDistance());
            }
        }while (index < 1 || index > circuits.length);
        return circuit;
    }

    /**
     * validateArrayCircuit - function that validates the data in the database array
     * @return array object object without null data
     */
    private static Circuits[] validateArrayCircuit(){
        Circuits[] circuitsDB = showCircuitsMenu();
        int count = 0;
        for (int i = 0; i < circuitsDB.length; i++) {
            if (circuitsDB[i] == null){
                break;
            }
            count++;
        }
        Circuits[] circuits = new  Circuits[count];
        for (int i = 0; i < circuits.length; i++) {
            circuits[i] = circuitsDB[i];
        }

        return circuits;
    }
}
