/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codificador;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Codificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        
        String[] letras=new String[5];
    
        System.out.println("Introduce la 1 letra a codificar");
        letras[0] = sc.next();
        System.out.println("Introduce la 2 letra a codificar");
        letras[1]= sc.next();
         System.out.println("Introduce la 3 letra a codificar");
        letras[2] = sc.next();
        System.out.println("Introduce la 4 letra a codificar");
        letras[3]= sc.next();
         System.out.println("Introduce la 5 letra a codificar");
        letras[4] = sc.next();
        System.out.print(letras[0]);
       
        
        
        
    }
    
}
