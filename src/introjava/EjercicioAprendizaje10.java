/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite,numero,suma;
        suma = 0;
        
        System.out.println("Ingresar el limite");
        limite = leer.nextInt();
        
        do {
            System.out.println("Ingresar numero que se desea sunar:");
            numero = leer.nextInt();
            
            suma += numero;
        } while (suma < limite);
        
        System.out.println("El lmite es " + limite);
        System.out.println("La suma de los numeros es " + suma);
        
    }
    
}
