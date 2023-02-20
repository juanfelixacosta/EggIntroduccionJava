/*
EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero,contador,suma;
        contador = 0;
        suma = 0;
        
        do {
            
             contador++;
            System.out.println("Indicar numero " + contador);
            numero = leer.nextInt();
            
            if (numero == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }else if (numero > 0) {
                suma = suma + numero;
            }
            
        } while (contador < 20);
        
        System.out.println("La suma de los " + contador + "  numeros ingresados es: " + suma);
    }
    
}
