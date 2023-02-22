/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indicar tu nombre:");
        String nombre = leer.nextLine();
        
        System.out.println("Tu nombre es " + nombre);
    }
    
}
