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
        System.out.println("=========== Lenguaje de Programacion =============");
        Scanner New = new Scanner(System.in);
        int aprobado = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa nombre: ");
            String name = New.nextLine();

            Scanner not = new Scanner(System.in);
            System.out.println("Ingresa nota: ");
            float Note = not.nextFloat();
            if (Note >= 3.0 && Note <= 5.0) {
                System.out.println("El estudiante " + name + " aprobó " + Note);
                aprobado++;
            } else {
                if ((Note >= 1.6 && Note <= 2.9)) {
                    System.out.println("El estudiante " + name + " desaprobó " + Note);
                } else {
                    if (Note >= 0 && Note <= 1.5) {
                        System.out.println("El estudiante " + name + " debe ir a tutoria ");
                    }

                }
            }

        }
        System.out.println("Cantidad de estudiantes aprobados: " + aprobado);
        System.out.println("==================================================");
    }

}
