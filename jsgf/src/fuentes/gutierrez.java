package fuentes;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian Gutierrez Fuentes
 */
public class gutierrez {
    String name;
    int n1,n2;
    public gutierrez(String name, int n1, int n2){
        this.name = name;
        this.n1= n1;
        this.n2= n2;
    }
    public int calcularSuma(){
        int suma = n1+n2;
        return suma;
    }
    public int calcularResta(){
        int resta = n1-n2;
        return resta;
    }
    public void  mostrarResultados(int suma, int resta){
        JOptionPane.showMessageDialog(null, "Hola " + name +
                "\n la suma es = " +suma+
                "\n la resta es = "+resta);
    }
}
