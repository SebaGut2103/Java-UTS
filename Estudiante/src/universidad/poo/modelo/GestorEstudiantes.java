/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.poo.modelo;

import java.util.ArrayList;

public class GestorEstudiantes {
    // Variable para guardar la lista de estudiantes
    private ArrayList<Estudiante> listaEstudiantes;

    // Se crea el arreglo en el constructor
    public GestorEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    // Crear un Estudiante y se almacena en el arreglo
    public boolean crear(Estudiante estudiante) {
        // Se valida si existe un estudiante con la misma cédula
        if (buscar(estudiante.getCedula()) == null) {
            listaEstudiantes.add(estudiante);
            return true; // Registrado con éxito
        }
        return false; // Ya existe
    }

    // Buscar un estudiante por la cédula
    public Estudiante buscar(String cedula) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null; // No encontrado
    }

    // Actualizar los datos de un estudiante
    public boolean actualizar(String cedula, Estudiante datosNuevos) {
        Estudiante actual = buscar(cedula);
        if (actual != null) {
            actual.setNombre(datosNuevos.getNombre());
            actual.setApellido(datosNuevos.getApellido());
            actual.setNotaTaller(datosNuevos.getNotaTaller());
            actual.setNotaParcial(datosNuevos.getNotaParcial());
            actual.setNotaAutoevaluacion(datosNuevos.getNotaAutoevaluacion());
            return true;
        }
        return false;
    }

    // Eliminar estudiante buscando por cédula
    public boolean eliminar(String cedula) {
        Estudiante e = buscar(cedula);
        if (e != null) {
            listaEstudiantes.remove(e);
            return true;
        }
        return false;
    }

    // Devolver la lista completa de estudiantes
    public ArrayList<Estudiante> obtenerTodos() {
        return listaEstudiantes;
    }
}