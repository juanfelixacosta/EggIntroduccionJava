/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una frase");
        String frase = leer.nextLine();
        
        if ("A".equalsIgnoreCase(frase.substring(0,1))) {
            System.out.println("La primera letra de la frase es: " + frase.substring(0, 1));
            System.out.println("CORRECTO!!!");
        }else{
            System.out.println("La primera letra de la frase es: " + frase.substring(0, 1));
            System.out.println("INCORRECTO!!!");
        }
    }
    
}
