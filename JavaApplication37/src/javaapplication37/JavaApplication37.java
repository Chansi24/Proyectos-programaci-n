/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class JavaApplication37 {
    public static void mostraragua(String[][]tablero)
    {
        for (int i = 0; i < tablero.length; i++) 
        {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String[][] tablero= new String[8][8]; 
        for (int i = 0; i < tablero.length; i++)
        {
            for (int j = 0; j < tablero[0].length; j++)
            {
                tablero[i][j]="__";
            }
    }
        tablero[0][0]="T1";
        tablero[0][7]="T2";
        tablero[0][1]="C1";
        tablero[0][6]="C2";
        tablero[0][2]="A1";
        tablero[0][5]="A2";
        tablero[0][3]="Q ";
        tablero[0][4]="K ";
        
        
        tablero[7][0]="T1";
        tablero[7][7]="T2";
        tablero[7][1]="C1";
        tablero[7][6]="C2";
        tablero[7][2]="A1";
        tablero[7][5]="A2";
        tablero[7][3]="Q ";
        tablero[7][4]="K ";
        
        for (int i = 0; i < tablero.length; i++) {
            for(int j =1;j<2;j++){
                tablero[j][i]="P ";
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            for(int j =6;j<7;j++){
                tablero[j][i]="P ";
            }
        }
            
        
        
        mostraragua(tablero);
        
    }
}

