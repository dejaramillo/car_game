package ui;

import model.Driver;

public class Route {
    /**
     * route -  function that recreates the race competition
     * @param routeDistance - distance from the circuit
     * @param driver - shift driver
     * @return doble data with the route
     */
    public static double route(double routeDistance, Driver driver){
        int dice = 0;
        dice = (int) ((Math.random() * 6) + 1) * 100;
        routeDistance = routeDistance - dice;
        if (routeDistance <= 0){
            System.out.println("El corredor "+driver.getUserName() + " llego a la meta (ノ ͡* ͜ʖ ͡*)ノ");
            return 0;
        }
        System.out.println("El corredor ( ͠❛ ͜ʖ ͠❛) "+ driver.getUserName() + " avanzo "  +dice +" Mts.");
        System.out.println("-----------------------------------------------------------------▄▀▄▀▄▀▄▀▄");
        System.out.println("-----------------------------------------------------------------▄▀▄▀▄▀▄▀▄");
        System.out.println("-----------------------------------------------------------------▄▀▄▀▄▀▄▀▄");
        System.out.println("-----------------------------------------------------------------▄▀▄▀▄▀▄▀▄");
        System.out.println("Le faltan " +routeDistance+ " MTS. De recorrido para llegar a la meta");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return routeDistance;
    }
}
