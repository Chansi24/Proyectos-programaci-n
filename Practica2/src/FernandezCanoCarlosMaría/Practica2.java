/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author Medac
 */
public class Practica2 {
    
    public static void rellenar(char[][] a)
            {
               for (int fila = 0; fila < a.length; fila++) 
               {
                    Arrays.fill(a[fila],'X');
                }
            }
    public static void mostrar(char[][]a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        char[][]tablero=new char[10][10];
        rellenar(tablero);
        
        for (int fila=0;fila<1;fila++)
        {
           for (int a=1;a<2;a++)
           {
               tablero [a][fila]=' ';
           }
        }
        for (int fila=0;fila<5;fila++)
        {
           for (int a=2;a<3;a++)
           {
               tablero [a][fila]=' ';
           }
        }
        for (int fila=4;fila<5;fila++)
        {
           for (int a=3;a<8;a++)
           {
               tablero [a][fila]=' ';
           }
        }
        for (int fila=4;fila<9;fila++)
        {
           for (int a=7;a<8;a++)
           {
               tablero [a][fila]=' ';
           }
        }
        for (int fila=8;fila<9;fila++)
        {
           for (int a=8;a<10;a++)
           {
               tablero [a][fila]=' ';
           }
        }
        tablero[9][9]=' ';
        
        System.out.println("---------------");
        int posx=0;
        int posy=0;
       tablero[0][0]='O';
        mostrar(tablero);
        boolean respuesta=true;
        int intentos=0;
        do{
        System.out.println("Indica hacia donde quieres ir: 1.derecha, 2.izquierda, 3.arriba, 4.abajo");
        
        int movimiento= sc.nextInt();
        if (movimiento==1){
            tablero[posx][posy]=' ';
            posy=posy+1;
            posx=posx;
        }
        if (movimiento==2){
            tablero[posx][posy]=' ';
            posy=posy-1;
            posx=posx;
            
        }
        if (movimiento==3){
            tablero[posx][posy]=' ';
            posx=posx-1;
            posy=posy;
                
        }
        if (movimiento==4){
            tablero[posx][posy]=' ';
            posx=posx +1;
            posy=posy;
            
        }
        if (tablero[posx][posy]=='X')
        {
            System.out.println("No puedes ir por ahi, has perdido 1 vida");
            intentos=intentos+1;
        }
        else{
        tablero[posx][posy]='O';
        }
        mostrar(tablero);
        if (tablero[9][9]=='O')
        {
            System.out.println("Has Ganado");
            respuesta =false;
        }
        if (intentos==3)
        {
            respuesta=false;
            System.out.println("Has perdido las 3 vidas, estás eliminado");
        }
        }
        while (respuesta==true);
    }
}
