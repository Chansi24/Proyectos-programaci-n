/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cluedo;

/**
 *
 * @author Medac
 */
public class Persona {

private String nombre;
private boolean asesino;
private String lugar;

public Persona (String nombre, boolean asesino, String lugar){
this.nombre=nombre;
asesino =false;
this.lugar=lugar;
}
public void dondeestabas (){
    if (asesino=false){
        this.lugar=lugar;
        System.out.println("estaba en "+ lugar);
    }
    else{
        int luga=(int)(Math.random()*6);
        switch (luga){
            case 0:
                 System.out.println("Dormitorio");
                break;
                
            case 1:
                 System.out.println("Jardin");
                break;
            
            case 2:
                 System.out.println("Cocina");
                break;
            
            case 3:
                 System.out.println("Salon");
                break;
                
            case 4:
                 System.out.println("Baño");
                break;
            
            case 5:
                System.out.println("Hall de entrada");
                break;
                
                
        }
    }
    
}

    public String getNombre() {
        return nombre;
    }

    public boolean getAsesino() {
        return asesino;
    }

    public String getLugar() {
        return lugar;
    }
public void asesino (boolean asesino){
    this.asesino=asesino=true;
}

}
