
package notasjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes
 */
public class NotasJoption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String noteData = JOptionPane.showInputDialog("Ingresa la primera nota");
       double note1 = Double.parseDouble(noteData);
       String noteData2 = JOptionPane.showInputDialog("Ingresa la segunda nota");
       double note2 = Double.parseDouble(noteData2);
       double avarage = note1 + note2 / 3.0;
       
        if (avarage >= 3.0) {
            JOptionPane.showMessageDialog(null, "Aprobaste");
        }else{
            JOptionPane.showMessageDialog(null, "No Aprovaste");
        }
    }

}
