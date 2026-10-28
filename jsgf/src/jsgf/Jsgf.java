package jsgf;

import fuentes.gutierrez;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes
 */
public class Jsgf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 =0 ;
        int n2 =0;
        String name;
        
        name = JOptionPane.showInputDialog("Digite el nombre del estudiante");
        n1 = Integer.parseInt(JOptionPane.showInputDialog(name + " Digite un numero entero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(name + " Digite un numero entero: "));
        
        gutierrez op = new gutierrez(name, n1, n2);
        int suma = op.calcularSuma();
        int resta = op.calcularResta();
        op.mostrarResultados(suma, resta);
    }
    
}
