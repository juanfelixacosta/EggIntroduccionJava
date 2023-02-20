/*
EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        byte numero = 25;
        
        System.out.println("Ingresa un numero");
        int numero_1 = leer.nextInt();
        System.out.println("Ingresa otro numero");
        int numero_2 = leer.nextInt();
        
         if (numero_1 > 25 && numero_2 > numero){
            System.out.println("El primer numero ingresado " + numero_1 + " es mayor a 25");
            System.out.println("El segundo numero ingresado " + numero_2 + " es mayor a 25");

        }else if (numero_1 > numero){
            System.out.println("El primer numero ingresado " + numero_1 + " es mayor a 25");
        }else if (numero_2 > numero){
            System.out.println("El segundo numero ingresado" + numero_2 + " es mayor a 25");
        }else{
            System.out.println("El primer numero ingresado " + numero_1 + " no es mayor a 25");
            System.out.println("El segundo numero ingresado " + numero_2 + " no es mayor a 25");
        }
    }
    
}
