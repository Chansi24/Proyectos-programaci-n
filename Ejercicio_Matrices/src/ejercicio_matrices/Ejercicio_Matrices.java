/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_matrices;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Ejercicio_Matrices {
    public static void mostrarmatriz (char[][]a){
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    char[][] matriz1={{'x','x','x','x'},{'x','x','x','x'},{'x','x','x','x'}};
         mostrarmatriz(matriz1);
         //mas limpio
    char[][] matriz=new char[3][4]; 
    for (int i=0;i<matriz.length;i++)
    {
       for(int j=0; j<matriz[0].length;j++)
       {
           matriz[i][j]='x';
       }
    }
    mostrarmatriz(matriz);
    }
    
}
