/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentacorriente;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributos o campos
    String nombre;
    int edad;
    String dni;
    String email;
    Persona (String nombre){
        this.nombre=nombre;
    }
    boolean mayorEdad(){
        boolean respuesta;
        if (edad<18){
            respuesta=false;
        }
        else{
            respuesta =true;
        }
        return respuesta;
    }
    Persona(){
        System.out.println("Has creado una persona");
    }
    Persona(String nombre, int edad, String dni, String email){
    this.nombre=nombre;
    this.edad=edad;
    this.dni=dni;
    this.email=email;
    }
    void Listar(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(dni);
        System.out.println(email);
    }
}
