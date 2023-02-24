/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        byte moneda;
        double euros;
        
        System.out.println("Indicar cantidad de Euros");
        euros = leer.nextDouble();
        
        do {
            System.out.println("Convertir");
            System.out.println("1. Dolares");
            System.out.println("2. Yenes");
            System.out.println("3. Libras");
            moneda = leer.nextByte();
        } while (moneda < 1 || moneda > 3);
        
        conversor(euros,moneda);
    }
    
    public static void conversor(double euros, byte moneda){
        switch (moneda){
            case 1:
                System.out.println(euros + "  euros a Dolares son " + (euros * 1.28611) + " Dolares");
                break;
            case 2:
                System.out.println(euros + "  euros a Yenes son " + (euros * 129.852) + " Yenes");
                break;
            case 3:
                System.out.println(euros + " euros a Libras son " + (euros * 0.86) + " Libras");
                break;
        }    
    }
}
