/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.poo.vista;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidad.poo.modelo.Estudiante;

public class VistaEstudiante {

    public String mostrarMenu() {
        String menu = " GESTIioN DE ESTUDIANTES POO\n"
                + "1. Registrar Estudiante\n"
                + "2. Listar Estudiantes\n"
                + "3. Editar Estudiante\n"
                + "4. Eliminar Estudiante\n"
                + "5. Salir\n\n"
                + "Seleccione una opción:";
        return JOptionPane.showInputDialog(null, menu, "Menú Principal",
                JOptionPane.QUESTION_MESSAGE);
    }

    public Estudiante solicitarDatosEstudiante(String cedulaPorDefecto) {
        try {
            String cedula = (cedulaPorDefecto != null) ? cedulaPorDefecto :
                    JOptionPane.showInputDialog("Ingrese la Cédula:");
            if (cedula == null || cedula.trim().isEmpty()) {
                return null;
            }
            String nombre = JOptionPane.showInputDialog("Ingrese el Nombre:");
            String apellido = JOptionPane.showInputDialog("Ingrese el Apellido:");
            double notaTaller = Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese la nota de Taller:"));
            double notaParcial = Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese la nota del Parcial:"));
            double notaAuto = Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese la nota de Autoevaluación:"));
            return new Estudiante(cedula, nombre, apellido, notaTaller, notaParcial, notaAuto);
        } catch (NumberFormatException e) {
            mostrarMensajeError("Error en formato numérico. Registro cancelado.");
            return null;
        } catch (HeadlessException e) {
            return null; // El usuario canceló
        }
    }

    public String solicitarCedula() {
        return JOptionPane.showInputDialog("Ingrese la cédula del estudiante:");
    }

    public void mostrarLista(ArrayList<Estudiante> lista) {
        if (lista.isEmpty()) {
            mostrarMensaje("No hay estudiantes registrados.");
            return;
        }
        StringBuilder sb = new StringBuilder("=== LISTA DE ESTUDIANTES ===\n");
        for (Estudiante e : lista) {
            sb.append(e.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Estudiantes",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}