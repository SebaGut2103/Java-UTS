package miercoles01;
import javax.swing.JOptionPane;
import triangulo.gutierrez;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes (SebaGut2103)
 */
public class Miercoles01 {

    public static void main(String[] args) {
       double base, side;
       
       side = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado: "));
       base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base: "));
       
        gutierrez forma = new gutierrez(base, side);
        forma.calPerimeter();
        forma.calHight();
        forma.calArea();
        forma.result();
    }
    
}
