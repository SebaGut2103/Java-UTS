/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.poo.main;

import universidad.poo.controlador.ControladorEstudiante;
import universidad.poo.modelo.GestorEstudiantes;
import universidad.poo.vista.VistaEstudiante;

public class Principal {
    public static void main(String[] args) {
        // 1. Instanciar el Modelo
        GestorEstudiantes modelo = new GestorEstudiantes();
        
        // 2. Instanciar la Vista
        VistaEstudiante vista = new VistaEstudiante();
        
        // 3. Instanciar el Controlador y pasarle las dependencias
        ControladorEstudiante controlador = new ControladorEstudiante(modelo, vista);
        
        // 4. Iniciar la aplicación
        controlador.iniciar();
    }
}