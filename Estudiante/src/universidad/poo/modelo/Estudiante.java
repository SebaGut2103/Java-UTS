/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

  package universidad.poo.modelo;

// Archivo: Estudiante.java
public class Estudiante {
    private String cedula;
    private String nombre;
    private String apellido;
    private double notaTaller;
    private double notaParcial;
    private double notaAutoevaluacion;

    public Estudiante(String cedula, String nombre, String apellido, 
                      double notaTaller, double notaParcial, double notaAutoevaluacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaTaller = notaTaller;
        this.notaParcial = notaParcial;
        this.notaAutoevaluacion = notaAutoevaluacion;
    }

    // Método de negocio (ponderación: 20%, 70%, 10%)
    public double calcularDefinitiva() {
        return (notaTaller * 0.2) + (notaParcial * 0.7) + (notaAutoevaluacion * 0.1);
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotaTaller() {
        return notaTaller;
    }

    public void setNotaTaller(double notaTaller) {
        this.notaTaller = notaTaller;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaAutoevaluacion() {
        return notaAutoevaluacion;
    }

    public void setNotaAutoevaluacion(double notaAutoevaluacion) {
        this.notaAutoevaluacion = notaAutoevaluacion;
    }

    @Override
    public String toString() {
        return String.format("Cédula: %s | %s %s | Taller: %.1f | Parcial: %.1f | Auto: %.1f | Definitiva: %.2f",
                cedula, nombre, apellido, notaTaller, notaParcial, notaAutoevaluacion, calcularDefinitiva());
    }
}  
    