
package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author aula7
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de alumnos: "));
        String[] name = new String[n];
        Integer[] cod = new Integer[n];
        Float[] not = new Float[n];
        
        int j = 0;
        for(int i= 0; i<n;i++){
            j=i+1;
            name[i]= JOptionPane.showInputDialog("Nombre[" + j+"]");
            cod[i]= Integer.parseInt(JOptionPane.showInputDialog("Codigo ["+j+"]"));
            not[i]= Float.parseFloat(JOptionPane.showInputDialog("Nota ["+j+"]"));
        }
        String text = "Nro. - Codigo-Nombre-Nota"+"\n";
        for(int i=0; i<n;i++){
            j=i+1;
            text=text+(j)+" -"+cod[i]+" -" +name[i]+" -"+not[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, text);
        
    }
    
}
