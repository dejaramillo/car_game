package serviceDao;

import model.Circuits;

import java.util.Scanner;

public class circuitService {
    /**
     * circuit creation wizard
     */
    public static void serviceCreateCircuit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear Cricuito");
        System.out.println("\nNombre: ");
        String name = sc.nextLine();
        System.out.println("\nDistancia del circuito");
        double distance = sc.nextDouble();
        Circuits circuits = new Circuits();
        circuits.setName(name);
        circuits.setDistance(distance);
        circuitsCRUD.createCircuit(circuits);
    }

    /**
     * circuit read wizard
     */
    public static void serviceReadCircuit(){
        circuitsCRUD.readCircuit();
    }

    /**
     * circuit update wizard
     */
    public static void serviceUpdateCircuit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Editar Cricuito");
        System.out.println("ingrese el Id del circuito que desea modificar");
        int updateId = sc.nextInt();
        System.out.println("\nNombre: ");
        String circuitName = sc.next();
        System.out.println("\nDistancia del circuito");
        double distance = sc.nextDouble();
        Circuits circuits = new Circuits();
        circuits.setId(updateId);
        circuits.setName(circuitName);
        circuits.setDistance(distance);
        circuitsCRUD.updateCircuit(circuits);
    }

    /**
     * circuit delete wizard
     */
    public static void serviceDeleteCircuits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id del circuito que desea eliminar");
        int deleteId = sc.nextInt();
        circuitsCRUD.deleteCircuit(deleteId);
    }

}
