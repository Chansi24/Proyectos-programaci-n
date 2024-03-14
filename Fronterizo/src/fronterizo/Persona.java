/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fronterizo;

/**
 *
 * @author Medac
 */
public class Persona {
    private String nombre;
    private String dni;
    //constructores
    public Persona (String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    //metodos

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
public String toString(){
    return "nombre"+ nombre + "dni"+dni;
}   
}
