/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package introjava;
import java.util.*;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena; //frase que debe intorducir el usuario por teclado
        int correctas,incorrectas; // contadores para saber las frases correctas e incorrectas
        correctas = 0; // correctas menos de cinco caracteres cumpliendo la condicion
        incorrectas = 0; // incorrectas mas de cinco caracteres o que no cumplan la condicion
        

        
        do {
                    System.out.println("Indicar una  frase");
                    cadena = leer.nextLine();
        
                    if (cadena.length() <= 5) {
                        //System.out.println("La cadena tiene cinco (5) o menos caracteres");
                            if ("X".equalsIgnoreCase(cadena.substring(0,1)) && "O".equalsIgnoreCase(cadena.substring(cadena.length() - 1,cadena.length() ))) {
                                //System.out.println("La cadena comienza con una X y termina con una O");
                                correctas++;
                            }else{
                                if (!cadena.equals("&&&&&")) {
                                    //System.out.println("La cadena no comienza con una X ni termina con una O");    
                                    incorrectas++;
                                }
                            }
                     }else{
                        //System.out.println("La cadena tiene mas de cinco (5) caracteres");
                        incorrectas++;
                       }
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("");
       System.out.println("*********************");
        System.out.println("Final De Envios (FDE)");
        System.out.println("*********************");
        System.out.println("Reporte dispositivo RS232");
        System.out.println("==========================");
        System.out.println("Las cadenas correctas recibidas fueron: " + correctas);
        System.out.println("Las cadenas incorrectas recibidas fueron: " + incorrectas);
        
    }
    
}
