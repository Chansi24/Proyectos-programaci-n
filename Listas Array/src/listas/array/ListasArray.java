/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas.array;
import java.util.ArrayList;

/**
 *
 * @author Medac
 */
public class ListasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*lista de numeros
    ArrayList<Integer> numeros=new ArrayList<>();
        System.out.println(numeros.size());
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        System.out.println(numeros);    
        System.out.println(numeros.size());
        numeros.add (1,4);
        System.out.println(numeros);
     */
        //lista string
        
     ArrayList<String> nombres=new ArrayList<>();  
     nombres.add("Juan");
     nombres.add("Pepe");
     nombres.add("Elena");
     nombres.remove(1);
     System.out.println(nombres);
     for(String ei:nombres){
         System.out.println(ei);
     } 
    }
    
}
