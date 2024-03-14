/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner sc= new Scanner(System.in);
            /*
        int tamaño;
        System.out.println("Introduce el tamaño del array");
        tamaño=sc.nextInt();
        int[] array=new int[tamaño];
        for (int i=0;i<tamaño;i++){
            System.out.println("Introduce un Número");
            array[i]=sc.nextInt();    
        }
         for (int i=0;i<tamaño;i++){
             System.out.print(array[i]+ " ");
         }
         System.out.print(";");
         for (int i=tamaño-1;i>-1;i--){
             System.out.print(array[i]+ " ");
         }

     
            
            int[] array= {7,5,3};
            int size =array.length;
            System.out.println(size);
   
        int[]a={3,2,7};
        int[]b=new int[3];
        a=b;
        System.out.println(b[0]);
        a[0]=5;
        System.out.println(b[0]);

   Random a=new Random(10);                
   int[] secreta=new int[3];
   int r1=(int)(Math.random()*10);
   int r2=(int)(Math.random()*10);
   int r3=(int)(Math.random()*10);
   secreta[0]=r1;
   secreta[1]=r2;
   secreta[2]=r3;
   System.out.println(Arrays.toString(secreta));
   int[]usuario=new int[3];
   System.out.println("Introduce un numero");
   usuario[0]=sc.nextInt();
   System.out.println("Introduce un numero");
   usuario[1]=sc.nextInt(); 
   System.out.println("Introduce un numero");
   usuario[2]=sc.nextInt();
   boolean respuesta=false;
   while (!respuesta){
   for (int i=0;i<3;i++){
      
       if(secreta[i]==usuario[i]){
           respuesta=true;
       }
       else{
           respuesta=false;
       } 
   }
*/
 int num1,num2,num3;
      int[] secreto= new int[3];
     secreto[0]=(int) (Math.random()*10);
       secreto[1]=(int) (Math.random()*10);
         secreto[2]=(int) (Math.random()*10);
             num1=sc.nextInt();
             num2=sc.nextInt();
             num3=sc.nextInt();
                while (num1!=secreto[0]||num2!=secreto[1]||num3!=secreto[2]){
                  System.out.println("secuencia incorrecta");
                    System.out.println(  secreto[0]);
                     System.out.println(  secreto[1]);
                      System.out.println(  secreto[2]);
                  num1=sc.nextInt();
             num2=sc.nextInt();
             num3=sc.nextInt();

             
                
                }
    }
    
}
