/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author Medac
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Persona persona1= new Persona("Antonio", 18, "44665509s", "carlitos");
    Persona persona2= new Persona (persona1);
    persona1.setNombre("pepe");
        System.out.println(persona2.getNombre());
        System.out.println(persona1.getNombre());
        System.out.println(Persona.id);
    
    /*
    persona1.nombre= "Juan";
    persona1.edad= 18;
    persona1.dni= "44665509s";
    persona1.email= "carlitos@gmail.com";
    persona1.Saludar();
    
    persona2.nombre= "Antonio";
    persona2.edad=27;
    persona2.dni= "12345678A";
    persona2.Comer();
    
    Persona persona3=new Persona ("Julian",18);
    System.out.println(persona3.nombre);
    persona3.Saludar();
    
    Persona persona5=new Persona("Paco", 18);
    persona5.incrementar(5);
        System.out.println(persona5.edad);

    Persona persona6=new Persona();
    persona6.edad=15;
        System.out.println(persona6.mayorEdad());
    Persona persona7=new Persona ("Juan", 18, "44556609s", "cacaca@gmail.com");
    persona7.Listar();
*/
    }
   
    
}
