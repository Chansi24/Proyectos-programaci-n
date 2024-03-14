/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        
     //Array cuando conozco que hay dentro
    int[] array= {5,3,2,1,7};
    char[] arrayc= {'a','b','c','d'};
        System.out.println(array[4]);
        
    //Array cuando no conozco lo que hay dentro
     int[] array2=new int[5];
        array2[0]=2;
        array2[1]=3;
        array2[2]=4;
        System.out.println(array2[0]+";"+array2[1]+";"+array2[2]);

    //rellenar con el teclado
    int[] tabla=new int[4];

        for (int i=0;i<4;i++)
        {
            System.out.println("introduce un valor");   
            tabla[i]=sc.nextInt();
        }
        //mostrar
        for(int i=0;i<4;i++)
        {
            System.out.print(tabla[i]+" ");              
        }
*/
    int[] array=new int[7];
    int suma=0;
    for (int i=0;i<7;i++)
    {
    System.out.println("introduce un valor");
    array[i]=sc.nextInt();    
    }
    /*
    for (int i=0;i<1;i++)
      {
          System.out.println("El resultado final es "+(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]));
      }
    */
        System.out.println(sumaArray(array));
        
        
        
        
    }
    public static int sumaArray(int[]a){
    int suma=0; 
    for (int i=0;i<7;i++){
        suma=suma+a[i];
    }
    return suma;
    }
    
}
