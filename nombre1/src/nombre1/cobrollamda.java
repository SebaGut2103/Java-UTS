
package nombre1;

import java.util.Scanner;

/**
 *
 * @author SebaGu2103 Juan Sebastian Gutierrez Fuentes
 */
public class cobrollamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==============================================");
        double cost = 500;
        Scanner New = new Scanner(System.in);
        System.out.println("¿Cuantos minutos duro tu llamada?");
        double min = New.nextDouble();
        double vPay = min * cost;
        System.out.println("Tu valor a pagar es: " + vPay);
        System.err.println("===============================================");
    }

}
