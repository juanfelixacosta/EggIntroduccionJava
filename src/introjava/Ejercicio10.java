/*
EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        
        for (int i = 1; i < 5; i++) {
            
            do {
                System.out.println("Ingresar numero " + i + " entre uno (1) y veinte (20)");
                numero  = leer.nextInt();
            } while (numero < 1 || numero > 20);
            
            
            System.out.print(numero + ":");
            
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
             System.out.println("");
        }
    }
    
}
