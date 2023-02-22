/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indicar la temperattura en Grados Centigrados");
        float centigrados = leer.nextFloat();
        
        float fahrenheit = 32 + (9 * (centigrados / 5));
        
        System.out.println("La temperatura en grados centigrados es: " + centigrados);
        System.out.println("La temperatura en grados fahrenheit es: " + fahrenheit);
    }
    
}
