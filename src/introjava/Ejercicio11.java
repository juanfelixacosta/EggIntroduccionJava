/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena;
        
        System.out.println("Ingrese una frase y termine la misma con un punto:");
       cadena = leer.nextLine();
        
        //System.out.println("La cadena ingresada es: " + cadena);
        //System.out.println("El tamaño de la cadena es: " + cadena.length());
        //System.out.println("El ultimo caracter de la cadena es " + cadena.charAt((cadena.length()) - 1));
        
        // charAt() retorna un caracter especifico
        while(cadena.charAt((cadena.length()) - 1) != '.'){
            System.out.println("Debe escribir nuevamente la frase");
            System.out.println("La frase debe culminar con un punto (.)");
            cadena = leer.nextLine();
        }
        
        for (int i = 0; i < (cadena.length()); i++) {
            //System.out.print(cadena.charAt(i));
            System.out.print(cambiarVocal(cadena.charAt(i)));
        }
        System.out.println("");
        
    }
    
    public static char cambiarVocal( char letra ){
        
        switch(letra){
            case 'a':
            case 'A':
            case 'á':
            case 'Á':
                return '@';
            case 'e':
            case 'E':
            case 'é':
            case 'É':
                return '#';
            case 'i':
            case 'I':
            case 'í':
             case 'Í':
                 return '$';
            case 'o':
            case 'O':
            case 'ó':
             case 'Ó':
                 return '%';
             case 'u':
            case 'U':
            case 'ú':
             case 'Ú':
                 return '*';
             default:
                 return letra;
              
        }
    
    }
    
}
