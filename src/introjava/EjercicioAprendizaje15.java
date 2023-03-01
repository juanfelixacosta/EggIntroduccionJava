/*
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente..
 */
package introjava;

/**
 *
 * @author juanf
 */
public class EjercicioAprendizaje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamano = 100;
        int[] vector = new int[tamano];
        int numero, maximo, auxiliar;
        
        //Llenar Vectior
        for (int i = 0; i < tamano; i++) {
            numero = (int) (Math.random() * 100 + 1); //Genera Numeros Aleatorios del 1 al 100
            vector[i] = numero;
        }
        
        //Mostrar Vector lleno
        for (int i = 0; i < tamano; i++) {
            System.out.println("Vector [" + (i + 1) +"] = " + vector[i]);
        }
        
        //System.out.println("Tamaño vector " + vector.length);
        System.out.println("======================================");
       
        //Ordenar Vector de forma descendente
        maximo = 0;
        for (int i = 0; i < tamano; i++) {
            if (vector[i] > maximo) {
                auxiliar = vector[i];
                vector[i] = maximo;
                maximo = auxiliar;
                for (int j = 0; j < i; j++) {
                    if (maximo > vector[j] ) {
                        auxiliar = vector[j];
                        vector[j] = maximo;
                        maximo = auxiliar;
                    }
                }
            }
        }
        
        // Mostrar vector ordenado de forma descendente
        for (int i = 0; i < tamano; i++) {
           System.out.println("Vector Descendente [" + (i + 1) + "] = " + vector[i]);
        }

    }
    
}
