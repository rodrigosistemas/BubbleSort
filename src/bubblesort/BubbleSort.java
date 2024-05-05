package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Algoritmo Bubble Sort");
        System.out.print("Ingrese la cantidad de elementos a ordenar: ");
        int cantidadElementos = entrada.nextInt();
        
        int[] arreglo = new int[cantidadElementos];
        
        // Ingreso de datos por parte del usuario
        for (int i=0; i<cantidadElementos; i++) {
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        // Ordenamiento Burbuja
        for (int i=0; i<cantidadElementos-1; i++) {
            for (int j=0; j<cantidadElementos-1; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
        
        // Imprimir el arrreglo ordenado
        System.out.println("\nEl arreglo ordenado es el siguiente: ");
        for (int i=0; i<arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
    }
    
}
