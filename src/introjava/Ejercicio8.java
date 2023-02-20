/*
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta
 */
package introjava;
import  java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        
        System.out.println("Indicar nota: ");
         nota = leer.nextInt();
        
        while (nota < 0  || nota > 10) {
             System.out.println("Indicar nota: (Entre cero (0) y diez (10) ");
              nota = leer.nextInt();
        }
    }
    
}
