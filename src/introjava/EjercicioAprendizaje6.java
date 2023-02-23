/*
6. Crear un programa que dado un numero determine si es par o impar.
 */
package introjava;
import java.util.*;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingresar un numero");
        numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR");
        }else {
            System.out.println("El numero " + numero + " es IMPAR");
        }
    }
    
}
