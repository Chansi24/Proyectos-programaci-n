/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int turnos;
        System.out.println("Introduce el número de turnos");
        turnos=sc.nextInt();
        System.out.println("Indica el tamaño de la palabra"); 
        int tamaño=sc.nextInt();
    char[] array= new char [tamaño]; 
    for (int i=0;i<tamaño;i++){ 
        System.out.println("Introduce la letra de la posición "+i);
        array[i]=sc.next().charAt(0);
    }
    System.out.println(Arrays.toString(array));
    for(int a=0;a<turnos;a++){
        System.out.println("Introduce una letra");
    }
    char[] array2= new char [tamaño];
    Arrays.fill(array2, '_');
    
    }
    
}
