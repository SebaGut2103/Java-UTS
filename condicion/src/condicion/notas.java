/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicion;

import java.util.Scanner;

/**
 *
 * @author SebaGut2103 Juan Sebastian Gutierrez Fuentes
 */
public class notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=========== Lenguaje de Programacion =============");
        Scanner New = new Scanner(System.in);
        System.out.println("Ingresa nombre: ");
        String name = New.nextLine();
        
        Scanner not = new Scanner(System.in);
        System.out.println("Ingresa nota: ");
        float Note = not.nextFloat();
        
        for (int i = 1; i<=5; i++){
            if (Note >=3.0 && Note <= 5.0 ){
                System.out.println("El estudiante " + name + "aprobó " + Note);
            }
            else{
                if ((Note >=1.6 && Note <= 2.9 )) {
                    System.out.println("El estudiante " + name + "desaprobó " + Note);
                }
               else{
                    if (Note >= 0 && Note <= 1.5) {
                        System.out.println("El estudiante " + name + " debe ir a tutoria ");
                    }
 
        }
            }
            
            
        }
        System.out.println("==================================================");
    }
    
}
