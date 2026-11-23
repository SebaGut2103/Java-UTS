package figura;

import javax.swing.JOptionPane;

/**
 *
 * @author SebaGut2103
 */
public class rectangulo {
    double anc;
    double altu;
    double area;
    double perim;

    public rectangulo(double anc, double altu) {
        this.anc = anc;
        this.altu = altu;
    }
    
    public void calcularArea(){
        area = anc * altu;
    }
    public void calcularPerimetro(){
        perim = anc+anc+altu+altu;
    }
    
    public void Resultado(){
        JOptionPane.showMessageDialog(null, "El area es: "+area+
                "\n Perimetro es: " +perim);
    }
}
