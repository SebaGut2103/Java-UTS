/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joption;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes
 */
public class JOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"======================");
        String data = JOptionPane.showInputDialog("Introduce el lado: ");
        double side = Double.parseDouble(data);
        double area = side * side;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area);
        JOptionPane.showMessageDialog(null, "==========================");
    }
    
}
