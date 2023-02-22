/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero_1, numero_2, suma;
        
        System.out.println("Ingresar Numero 1:");
        numero_1 = leer.nextInt();
        
        System.out.println("Ingresar Numero 2:");
        numero_2 = leer.nextInt();
        
        suma = numero_1 + numero_2;
        
        System.out.println("La suma de los numeros " + numero_1 + " + "+ numero_2 + " es " + suma);
    }
    
}
