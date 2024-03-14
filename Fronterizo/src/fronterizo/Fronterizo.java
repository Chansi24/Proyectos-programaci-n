/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fronterizo;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Fronterizo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
        int i=0;
        Persona[]arraypersona = new Persona[100];
        
        boolean salir= true;
         do{
        System.out.println("Que quieres hacer? 1.Crear Persona 2.Mostrar personas 3.Buscar DNI 4.Buscar Nombre 5.Salir");
        int opcion = sc.nextInt();
       
    switch(opcion){
        case 1:
            System.out.println("Dime el nombre de la persona");
            String nombre= sc.next();
            System.out.println("Dime el dni de la persona");
            String dni=sc.next();
            Persona p1= new Persona(nombre, dni);
            arraypersona[i]= p1;
            i++;
            break;
            
        case 2:
            for (int a=0; a<i;a++){
            System.out.println(arraypersona[a]);
            }
            break;
        case 3:
            System.out.println("Introduce un DNI a buscar");
            String dni1= sc.next();
            for (int a=0; a<i;a++){
                if (dni1.equals(arraypersona[a].getDni()))
                {
                    System.out.println("La persona con DNI"+ dni1 + "es "+ arraypersona[a].getNombre());
                }
                        
                        }
            break;
        case 4:
            System.out.println("Introduce un Nombre a buscar");
            String nombre1= sc.next();
            for (int a=0; a<i;a++){
                if (nombre1.equals(arraypersona[a].getNombre()))
                {
                    System.out.println("La persona con nombre"+ nombre1 + "tiene el dni: "+ arraypersona[a].getDni());
                }
                        
                        }
            break; 
        
        case 5:
            salir = false;    
    }
     
     }
        while (salir ==true);
        System.out.println("Has salido del programa");
        }
    }
    

