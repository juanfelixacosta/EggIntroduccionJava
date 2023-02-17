/*
EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa True o False");
        boolean casado = leer.nextBoolean();
        System.out.println("Ingresa una cantidad con decimales");
        double cantidad = leer.nextDouble();
        System.out.println("Ingresa un caracter");
        char caracter = leer.next().charAt(0);
        
        System.out.println("El valor Booleano ingresado es: " + casado);
        System.out.println("El valor Double ingresado es: " + cantidad);
        System.out.println("El valor Char ingresado es " + caracter);
    }
    
}
