package gutierrezfuentesmaldonadoduarte;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez &  Ronald Esteban Maldonado Duarte
 */
public class GutierrezFuentesMaldonadoDuarte {

    public static void main(String[] args) {
        int j = 35; //Contador de Estudiantes
        
        int s = 0; //Contador de Baloncesto
        int g = 0; //Contador de Futball
        int f = 0; //Contador de Patinaje 
        int r = 0; //Contador de Ningun seleccionado
        
        double gf = 0; //Suma de estatura de Baloncesto
        double md = 0; //Promedio de estatura
        
        for(int i = 1; i<=j; i++){
            String GF = JOptionPane.showInputDialog("Estudiante: "+i+ 
                    "\n Ingrese nombre de estudiante: ");
            String RE = JOptionPane.showInputDialog("Seleecione un deporte: "
            + "\n 1.Baloncesto"
            + "\n 2.Futball"
            + "\n 3.Patinaje"
            +"\n 4.Ninguno");
            
            double JS = Double.parseDouble(JOptionPane.showInputDialog("Ingresa estatura: " + " en metros"));
            
            switch (RE) {
                case "1":
                    s++;
                    gf += JS; //Suma de estatura
                    break;
                case "2":
                    g++;
                    break;
                case "3":
                    f++;
                    break;
                case "4":
                    r++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, no existe esta opcion. "
                    +" Sera tomado como ninguno ");
                    r++;
                    break;    
            }
    }
            if (s > 0) {
                md = gf / s;   
            }
                    String jSG; //Deporte mas seleccionado
            if (g>s) {
                jSG="Futball";
            }else if (s>s) {
                jSG="Baloncesto";
            }else{
                JOptionPane.showMessageDialog(null, "Empate entre los dos deportes mas seleccionados");
            }        
            String rEM = "Resultado del Grupo: "
                    + "\n 1.Estudiantes que no practican en ningun deporte: [" +r +"]. " 
                    + "\n 2.Estudiantes que practican patinaje [" + f + "]"
                    + "\n 3.El promedio de estatura de los estudiantes que practican Baloncesto: [" +md+"]"
                    + "\n 4.Estudiantes que practican Baloncesto: ["+s+"]"
                    + "\n 5.Estudiantes que practican Futaball: ["+g+"]";
            JOptionPane.showMessageDialog(null, rEM);
    } 
}
