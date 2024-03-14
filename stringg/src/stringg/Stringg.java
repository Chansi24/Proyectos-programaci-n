/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringg;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Stringg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*String texto1= "hola";
     String texto2= "que tal";
     String texto3= texto1 + texto2;
     String texto4= "hola";
     System.out.println(texto1);
     System.out.println(texto2); 
     System.out.println(texto3);
     System.out.println(texto1.equals(texto4));
     System.out.println(texto3.length());
     System.out.println(texto1.indexOf('h'));
     System.out.println(texto3.indexOf('a'));
     System.out.println(texto2.charAt(3));
     System.out.println(texto1.substring(0,2));
     System.out.println(texto1.toUpperCase());
        System.out.println(String.valueOf(5));

     Scanner sc= new Scanner (System.in);
     System.out.println("Una palabra fiera");
     String palabra1 = sc.nextLine();
     System.out.println("Otra palabra");
     String palabra2 = sc.nextLine();
     if (palabra1.length()>palabra2.length()){
        System.out.println("La primera palabra es mas larga que la segunda");
     }
     if (palabra2.length()>palabra1.length()){
        System.out.println("La segunda palabra es mas larga que la primera");
     }
     else{
         System.out.println("Las palabras son igual de largas");
     
     }
    */
     
    //Acierta la contraseña
    Scanner sc= new Scanner (System.in);
    System.out.println("Introduce una palabra");
    String palabra1 = sc.nextLine();
    System.out.println("La primera letra es " +(palabra1.charAt(0)));
    System.out.println("La ultima letra es " + (palabra1.charAt(palabra1.length()-1)));
    boolean aciertas = false;
    do
    {
    System.out.println("A ver si aciertas mostro");
    String palabra2 = sc.nextLine();
    if (palabra1.equals(palabra2)){
        aciertas=true;
        System.out.println("Ganaste");
    }
    }
    while(aciertas==false);
    }
    
}
