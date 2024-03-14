/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner tc=new Scanner(System.in);
     
     int dato;
    // dato=tc.nextInt();
     
     int yearNacimiento,yearActual,edadUsuario;
     
     System.out.println("Introduce el año actual");
     yearActual=tc.nextInt();
     
     System.out.println("Introduce el año de nacimiento");
     yearNacimiento=tc.nextInt();
     
     edadUsuario=yearActual-yearNacimiento;
     System.out.println("Mi edad es: "+edadUsuario);
             
}
}