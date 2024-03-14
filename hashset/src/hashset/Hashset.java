/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Medac
 */
public class Hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Integer>numeros=new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(9);
        System.out.println(numeros);
        numeros.add(9);
        System.out.println(numeros);
        
        for (int i = 1; i <= 10; i++) {
            if(numeros.contains(i)){
                System.out.println("contiene"+i);
            }
            
            
        }
        
        HashSet<String>nombres=new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Vicente");
        System.out.println(nombres);
        
        Iterator<String>it=nombres.iterator();
        while(it.hasNext()){
            System.out.println("nombre es "+ it.next());
        }
        String prueba="Pepe";
        System.out.println(nombres.contains(prueba));
       //-----------------------------------------------------------
        
       HashSet<Persona>personas=new HashSet<>();
       personas.add(new Persona("pepe","777",18));
       personas.add(new Persona("juan","111",20));
       Persona p1=new Persona("elena","77",30);
       Persona p2=new Persona("elena","77",30);
       personas.add(p1);
       personas.add(p2);
        System.out.println(personas);
        personas.add(p1);
        System.out.println(personas);
        System.out.println(personas.contains(p1));
       
    }
    
}
