package miercoles;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Gutierrez, Jordan Ruidiaz Videz 
 */
public class Miercoles {

    public static void main(String[] args) {
        float precio = 9500;
        Scanner juan = new Scanner(System.in);
        System.out.println("Ingresa nombre: ");
        String nomb = juan.nextLine();
        
        Scanner jordan = new Scanner(System.in);
        System.out.println("Ingresa estatura del niño: ");
        float estaturaIngr = jordan.nextFloat(); /*La variable es estatura ingresar att:JSGF */
        if (estaturaIngr > 162 ) {
            float total = precio / 3;
            System.out.println(nomb + " el total a pagar es " + total);
        }
        else{
            System.out.println(nomb + " no paga");
        }
    }
    
}
