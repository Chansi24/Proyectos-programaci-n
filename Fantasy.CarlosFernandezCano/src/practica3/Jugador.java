/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author Medac
 */
public class Jugador {
    private String nombre;
    private String pos;
    private int precio;
    
    public Jugador (String nombre, String pos, int precio){
        this.nombre = nombre;
        this.pos = pos;
        this.precio = precio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getPos() {
        return pos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    
}    
    

