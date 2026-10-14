
package listacircularjugadores;

public class ListaCircularJugadores extends ListaCircular {
    private Nodo turno; // nodo del jugador que tiene el turno

    public ListaCircularJugadores() {
        super();
        turno = null;
    }

    public void registrarJugador(String nombre) {
        if (buscar(nombre) != null) {
            System.out.println("Ya existe un jugador con ese nombre.");
            return;
        }

        insertar(new Jugador(nombre));

        // Si es el primer jugador, empieza con el turno
        if (turno == null) {
            turno = primero;
        }
        System.out.println("Jugador registrado: " + nombre);
    }

    public void mostrarTurnoActual() {
        if (turno == null) {
            System.out.println("No hay jugadores, nadie tiene el turno.");
        } else {
            System.out.println("Turno actual: " + turno.jugador);
        }
    }

    public void siguienteTurno() {
        if (turno == null) {
            System.out.println("No hay jugadores, no se puede pasar el turno.");
        } else {
            turno = turno.siguiente; // al llegar al último vuelve al primero
            System.out.println("Ahora es el turno de: " + turno.jugador);
        }
    }

    public void eliminarJugador(String nombre) {
        Nodo nodo = buscar(nombre);

        if (nodo == null) {
            System.out.println("No se encontró al jugador.");
            return;
        }

        // Si eliminamos al que tiene el turno, el turno pasa al siguiente
        if (nodo == turno) {
            turno = nodo.siguiente;
        }

        eliminar(nombre);

        // Si ya no quedan jugadores, no hay turno
        if (estaVacia()) {
            turno = null;
        }
        System.out.println("Jugador eliminado: " + nombre);
    }

    public void mostrarCantidad() {
        System.out.println("Cantidad de jugadores: " + getCantidad());
    }
}