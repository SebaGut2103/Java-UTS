/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.poo.controlador;

import universidad.poo.modelo.Estudiante;
import universidad.poo.modelo.GestorEstudiantes;
import universidad.poo.vista.VistaEstudiante;

public class ControladorEstudiante {
    // Atributos: El modelo y la vista
    private GestorEstudiantes modelo;
    private VistaEstudiante vista;

    // Constructor completo
    public ControladorEstudiante(GestorEstudiantes modelo, VistaEstudiante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Iniciar el Proyecto mostrando el menú
    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            String opcion = vista.mostrarMenu();
            // Si el usuario presiona "Cancelar" o la 'X' en el JOptionPane
            if (opcion == null) {
                salir = true;
                continue;
            }

            switch (opcion) { // Control del Menú
                case "1": // Crear
                    crearEstudiante();
                    break;
                case "2": // Leer / Listar
                    vista.mostrarLista(modelo.obtenerTodos());
                    break;
                case "3": // Actualizar
                    editarEstudiante();
                    break;
                case "4": // Eliminar
                    eliminarEstudiante();
                    break;
                case "5": // Salir
                    salir = true;
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensajeError("Opción no válida.");
            }
        }
    }

    private void crearEstudiante() {
        Estudiante nuevo = vista.solicitarDatosEstudiante(null);
        if (nuevo != null) {
            if (modelo.crear(nuevo)) {
                vista.mostrarMensaje("Estudiante registrado con éxito.");
            } else {
                vista.mostrarMensajeError("El estudiante con esa cédula ya existe.");
            }
        }
    }

    private void editarEstudiante() {
        String cedula = vista.solicitarCedula();
        if (cedula != null) {
            Estudiante actual = modelo.buscar(cedula);
            if (actual != null) {
                vista.mostrarMensaje("Ingrese los nuevos datos (La cédula se mantendrá).");
                Estudiante modificado = vista.solicitarDatosEstudiante(cedula);
                if (modificado != null && modelo.actualizar(cedula, modificado)) {
                    vista.mostrarMensaje("Estudiante actualizado correctamente.");
                }
            } else {
                vista.mostrarMensajeError("Estudiante no encontrado.");
            }
        }
    }

    private void eliminarEstudiante() {
        String cedula = vista.solicitarCedula();
        if (cedula != null) {
            if (modelo.eliminar(cedula)) {
                vista.mostrarMensaje("Estudiante eliminado con éxito.");
            } else {
                vista.mostrarMensajeError("Estudiante no encontrado.");
            }
        }
    }
}