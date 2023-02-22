/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package introjava;
import static java.lang.Math.pow;
import java.util.*;
/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribir un numero");
        int numero = leer.nextInt();
        
        double raiz = Math.sqrt(numero);
        
        System.out.println("El numero " + numero);
        System.out.println("Elevado al cuadrado es " + pow(numero,2));
        System.out.println("Elevado al cubo es " + pow(numero,3));
        System.out.println("La raiz cuadrada es " + raiz);
    }
    
}
