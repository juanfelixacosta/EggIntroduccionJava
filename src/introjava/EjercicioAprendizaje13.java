/*
13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int lados;
        
        System.out.println("Indicar los lados del cuadrado: ");
        lados = leer.nextInt(); // Tamaño del cuadrado
        
        construirCuadrado(lados);
    }
    
    public static void construirCuadrado(int lados){
        
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if (i == lados - lados || i == lados - 1) {
                    System.out.print("*");
                }else if (j == lados - lados || j == lados - 1){
                    System.out.print("*");
                }else if (j != lados - lados || j != lados - 1){
                    System.out.print(" ");
                }
            }
             System.out.println(" ");
        }
    } 
}
