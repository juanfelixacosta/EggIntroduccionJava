/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indicar una frase");
        String frase = leer.nextLine();
        
        System.out.println("La frase en MAYUSCULAS es '" + frase.toLowerCase() + "'");
        System.out.println("La frase en MINUSCULAS es '" + frase.toUpperCase() + "'");
    }
    
}
