/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero_1,numero_2;
        
        System.out.println("Indicar numero 1: ");
        numero_1 = leer.nextInt();
        
        System.out.println("Indicar numero 2: ");
        numero_2 = leer.nextInt();
        
        EsMultiplo(numero_1,  numero_2);
        
    }
    
    public static void EsMultiplo(int numero_1, int numero_2){
        
        if (numero_1 % numero_2 == 0) {
            System.out.println("El numero 1 = " + numero_1 + " es multiplo del numero 2 =  " + numero_2);            
        }else{
            System.out.println("El numero 1 = " + numero_1 + " NO es multiplo del numero 2 = " + numero_2);
        }
        
    }
}
