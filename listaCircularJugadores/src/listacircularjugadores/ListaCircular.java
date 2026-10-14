
package listacircularjugadores;

public class ListaCircular {
    protected Nodo primero;
    protected Nodo ultimo;
    protected int cantidad;
 
    public ListaCircular() {
        primero = null;
        ultimo = null;
        cantidad = 0;
    }
 
    public boolean estaVacia() {
        return cantidad == 0;
    }
 
    // Inserta al final y el último siempre apunta al primero
    public void insertar(Jugador jugador) {
        Nodo nuevo = new Nodo(jugador);
 
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = nuevo; // se apunta a sí mismo
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero; // cierra el círculo
            ultimo = nuevo;
        }
        cantidad++;
    }
 
    // Recorre la lista una sola vuelta
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("No hay jugadores registrados.");
            return;
        }
 
        Nodo actual = primero;
        int posicion = 1;
        do {
            System.out.println(posicion + ". " + actual.jugador);
            actual = actual.siguiente;
            posicion++;
        } while (actual != primero);
    }
 
    // Busca un nodo por el nombre del jugador
    public Nodo buscar(String nombre) {
        if (estaVacia()) {
            return null;
        }
 
        Nodo actual = primero;
        do {
            if (actual.jugador.getNombre().equalsIgnoreCase(nombre)) {
                return actual;
            }
            actual = actual.siguiente;
        } while (actual != primero);
 
        return null;
    }
 
    // Elimina un jugador por nombre. Devuelve true si lo eliminó
    public boolean eliminar(String nombre) {
        if (estaVacia()) {
            return false;
        }
 
        Nodo actual = primero;
        Nodo anterior = ultimo;
 
        do {
            if (actual.jugador.getNombre().equalsIgnoreCase(nombre)) {
                if (cantidad == 1) {
                    primero = null;
                    ultimo = null;
                } else {
                    anterior.siguiente = actual.siguiente;
                    if (actual == primero) {
                        primero = actual.siguiente;
                    }
                    if (actual == ultimo) {
                        ultimo = anterior;
                    }
                }
                cantidad--;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != primero);
 
        return false;
    }
 
    public int getCantidad() {
        return cantidad;
    }
}