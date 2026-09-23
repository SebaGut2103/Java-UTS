package hoy;

import java.util.Scanner;

/**
 *
 * @author SebaGut2103
 */
public class Hoy {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nomb = nuevo.nextLine();
        System.out.println("Hola " + nomb);
        
        System.out.println(nomb + " edad");
        int ed = nuevo.nextInt();
        System.out.println(nomb + " Su edad es " + ed);
    }
    
}
