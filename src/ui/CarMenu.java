package ui;

import model.Cars;

import java.util.Scanner;

public class CarMenu {
    /**
     * carMenu - function for customize car
     * @return - object zoned car
     */
    public static Cars carMenu() {
        final String[] BRANDS = {"Mercedez", "Renault", "Ferrari"};
        final String[] COLORS = {"Rojo", "Negro", "Blanco"};
        Scanner sc = new Scanner(System.in);
        int response = 0;
        String brand = null;
        String color = null;
        do {
            System.out.println("Seleccione la marca del carro");
            System.out.println("1.Mercedez. \n2.Renault \n3.Ferrari");
            response = sc.nextInt();
            switch (response) {
                case 1:
                    brand = BRANDS[0];
                    break;
                case 2:
                    brand = BRANDS[1];
                    break;
                case 3:
                    brand = BRANDS[2];
                    break;
                default:
                    System.out.println("Seleccione la marca correcta");
                    System.out.println("++++++++++++++++++++++++++++++");
            }
        } while (response < 1 || response > 3);

        do {
            System.out.println("Seleccione el color del carro");
            System.out.println("1.Rojo. \n2.Negro \n3.Blanco");
            response = sc.nextInt();
            switch (response) {
                case 1:
                    color = COLORS[0];
                    break;
                case 2:
                    color = COLORS[1];
                    break;
                case 3:
                    color = COLORS[2];
                    break;
                default:
                    System.out.println("Seleccione la marca correcta");
                    System.out.println("+++++++++++++++++++++++++++++");
            }
        } while (response < 1 || response > 3);
        Cars car = new Cars(brand,color);
        return car;
    }
}
