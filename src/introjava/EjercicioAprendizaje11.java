/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú: 
MENU:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija Opcion:.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        byte opcion;
        int numero_1, numero_2;
        char exit = 'N';
        
        System.out.println("Indicar numero 1");
        numero_1 = leer.nextInt();
        
        System.out.println("Indicar numero 2");
        numero_2 = leer.nextInt();
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicarr");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opcion: ");
            opcion = leer.nextByte();
            
            switch(opcion){
                case 1:
                    System.out.println("La suma de los numeros " + numero_1 + " + " + numero_2 + " = " + (numero_1 + numero_2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros " + numero_1 + " - " + numero_2 + " = " + (numero_1 - numero_2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros " + numero_1 + " * " + numero_2 + " = " + (numero_1 * numero_2));
                    break;
                case 4:
                    System.out.println("La division de los numeros " + numero_1 + " / " + numero_2 + " = " + (numero_1 / numero_2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    exit = leer.next().charAt(0);
                    if ('S' == exit || 's' == exit) {
                        System.out.println("Se ha salido del programa!!!");
                        break;
                    }
                default:
                    System.out.println("Debe indicar una opcion valida entre 1 y 5");
            }
        } while (opcion != 5);
        
    }
    
}
