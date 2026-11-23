package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes (SebaGut2103)
 */
public class gutierrez {
    double base;
    double side;
    double area;
    double hight;
    double perimeter;

    public gutierrez(double base, double side) {
        this.base = base;
        this.side = side;
    }
    
    public void calPerimeter(){
        perimeter = side*2 + base;
    }
    
    public void calHight(){
       hight = Math.sqrt(Math.pow(side, 2) - Math.pow(base / 2, 2));
    }
    
    public void calArea(){
        area = base*hight/2;
    }
    
    public void result(){
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: "+perimeter
        + "\n y el area es: " +area);
    }
}
