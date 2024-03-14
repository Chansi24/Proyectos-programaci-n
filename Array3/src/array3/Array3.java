/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /* 
   char a[]=new char[5];
   Arrays.fill (a,'a');
        System.out.print(Arrays.toString(a));
*/
   Scanner sc= new Scanner(System.in);
   int[] array1={1,2,3};
   int tamaño;
        System.out.println("Indica el tamaño del segundo array jefe, el número mínimo aceptado es 3");
        tamaño=sc.nextInt();
   int[] array2=new int[tamaño];
   for (int i=0;i<tamaño;i++){
       System.out.println("Introduce un número del 1 al 10"); 
       array2[i]=sc.nextInt();   
   }
   boolean compara=false;
   if(array1[0]==array2[0]|array1[1]==array2[1]|array1[2]==array2[2]);
   compara=true;
    }
    
}
