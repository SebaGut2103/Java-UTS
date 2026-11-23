package gutierrez;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes SebaGut2103
 */
public class gutierrez {
    int num;
    int num2;
    int suma;
    int resta;
    int multi;

    public gutierrez(int num, int num2) {
        this.num = num;
        this.num2 = num2;
        
    }    public void sumaNum(){
        suma = num + num2;
    }
    public void restaNum(){
        resta = num - num2;
    }
    public void multiNum(){
        multi = num * num2;
    }
    public void resul(){
        JOptionPane.showMessageDialog(null, "El resulado de cada uno son: Suma = ["+suma+"]"
                + "\n Resta = ["+resta+"]"+
                "\n Multiplicacion = [*"+multi+"]");
    }
}
