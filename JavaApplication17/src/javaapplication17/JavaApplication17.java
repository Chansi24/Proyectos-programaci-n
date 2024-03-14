/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;
import java.util.Arrays;
/** BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS 
 *  BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS BUSCAMINAS
 * @author Medac
 */ 
public class JavaApplication17 {
public static void mostrar(char [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
//intentos
System.out.println("Introduce el numeros de intentos: ");
        int intentos = sc.nextInt();
        System.out.println("Tienes " +intentos+ " intentos");
     //creamos el tablero
       char[][] tablero=new char[3][3];
       char[][] tablero_copia=new char[3][3];
       //rellenar
       for(int i=0;i<tablero.length;i++){
           for(int j=0;j<tablero[0].length;j++)
               tablero[i][j]='s';
       } 
       for (int i = 0; i < tablero.length; i++)
           {
               for (int j = 0; j < tablero[0].length; j++) 
               {
                   tablero_copia[i][j]=tablero[i][j];
               }

            }
            int posx=(int) (Math.random()*3);
            int posy=(int) (Math.random()*3);
            tablero[posx][posy]='o';   
           mostrar(tablero);
            System.out.println("-------------");
            System.out.println("-------------");            
            mostrar(tablero_copia);     
            System.out.println("Vamos a jugar al buscaminas.");
            boolean buscaminas=false;
            do {
            System.out.println("Introduce unas coordenadas de filas: ");
            int filas=sc.nextInt();
            System.out.println("Introduce unas coordenadas de columnas");
            int col=sc.nextInt();
            if (tablero[filas-1][col-1]=='o') 
            {
                buscaminas=true;
                System.out.println("BOOM");
            }
            else
            {
                System.out.println("No hay ninguna bomba en las coordenas "+ filas +" / " + col);
                intentos--;
                
                if (intentos==0) 
                {
                     System.out.println("Has perdido, te has quedado sin intentos");
                }
                else{
                     System.out.println("Te quedan " +intentos+ " intentos");
                }
               
                
            }
        } while (!buscaminas&&intentos>0);
            
        if (intentos>0) 
        {
            System.out.println("Enhorabuena!!!!, Has ganado.");
        }

     

    }
}
