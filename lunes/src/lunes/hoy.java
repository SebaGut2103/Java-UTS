package lunes;

import gutierrez.gutierrez;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes SebaGut2103
 */
public class hoy {
    public static void main(String[] args) {
        int num, num2;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el siguiente numero: "));
       
        gutierrez resultado = new gutierrez(num, num2);
            resultado.sumaNum();
            resultado.restaNum();
            resultado.multiNum();
            resultado.resul();
            
    }
    
    
}
