/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

/**
 *
 * @author Medac
 */
public class Jugador {
   private String nombre;
   private String dni;
   private int fichas;
   private int edad;
public Jugador(String nombre, String dni, int fichas, int edad){
    this.nombre=nombre;
    this.dni=dni;
    fichas =100;
    this.edad=edad;   
}

    public String getNombre() {
        return nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

}
