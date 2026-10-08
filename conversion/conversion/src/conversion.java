import java.util.Scanner;

public class conversion {
    public static void main(String[] args) throws Exception {
        System.out.println("=======Conversiones=======");
        float pesoDolar = 3500;
        float pesoEuro = 4000;
        float pesoMx = 1500;
        float pesoLibra = 4500;
        float pesoNoruega = 4700;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la opcion de conversion que desea realizar");
        System.out.println("1. Pesos colombianos a dolares");
        System.out.println("2. Pesos colombianos a euros");
        System.out.println("3. Pesos colombianos a pesos mexicanos");
        System.out.println("4. Pesos colombianos a libras esterlinas");
        System.out.println("5. Pesos colombianos a coronas noruegas");
    
        int op = scanner.nextInt();
        switch(op){
            case 1: Scanner dol = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de pesos colombianos a convertir a dolares");
                    float pesos = dol.nextFloat();
                    float resultado = pesos/pesoDolar;
                    System.out.println("El resultado es: " + resultado + " dolares");
                    break;
            case 2: Scanner eur = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de pesos colombianos a convertir a euros");
                    float pesos2 = eur.nextFloat();
                    float resultado2 = pesos2/pesoEuro;
                    System.out.println("El resultado es: " + resultado2 + " euros");
                    break;
            case 3: Scanner mx = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de pesos colombianos a convertir a pesos mexicanos");
                    float pesos3 = mx.nextFloat();
                    float resultado3 = pesos3/pesoMx;
                    System.out.println("El resultado es: " + resultado3 + " pesos mexicanos");
                    break;
            case 4: Scanner lib = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de pesos colombianos a convertir a libras esterlinas");
                    float pesos4 = lib.nextFloat();
                    float resultado4 = pesos4/pesoLibra;
                    System.out.println("El resultado es: " + resultado4 + " libras esterlinas");
                    break;
            case 5: Scanner nor = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de pesos colombianos a convertir a coronas noruegas");
                    float pesos5 = nor.nextFloat();
                    float resultado5 = pesos5/pesoNoruega;
                    System.out.println("El resultado es: " + resultado5 + " coronas noruegas");
                    break;
            default: System.out.println("Opcion no valida");
        }
        System.out.println("Gracias por usar el programa de conversiones");
        System.err.println("========================================================");
    }
}
