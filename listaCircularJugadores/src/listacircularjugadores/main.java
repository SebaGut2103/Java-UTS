
package listacircularjugadores;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ListaCircularJugadores juego = new ListaCircularJugadores();
            int opcion;
            
            do {
                System.out.println("\n===== JUEGO DE CARTAS =====");
                System.out.println("1. Registrar jugador");
                System.out.println("2. Mostrar jugadores");
                System.out.println("3. Mostrar turno actual");
                System.out.println("4. Pasar al siguiente turno");
                System.out.println("5. Eliminar un jugador");
                System.out.println("6. Mostrar cantidad de jugadores");
                System.out.println("0. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // limpia el salto de línea
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Nombre del jugador: ");
                        juego.registrarJugador(sc.nextLine());
                    }
                    case 2 -> juego.mostrar();
                    case 3 -> juego.mostrarTurnoActual();
                    case 4 -> juego.siguienteTurno();
                    case 5 -> {
                        System.out.print("Nombre del jugador a eliminar: ");
                        juego.eliminarJugador(sc.nextLine());
                    }
                    case 6 -> juego.mostrarCantidad();
                    case 0 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 0);
        }
    }
    
    
    
}
