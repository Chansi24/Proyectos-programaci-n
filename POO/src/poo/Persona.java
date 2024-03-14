/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

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
    static int id =1;
    
    public Persona (String nombre, int edad, String dni, String email){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.email=email;
        id++;
    }

   
    public Persona (Persona persona){
        nombre=persona.nombre;
        edad= persona.edad;
        dni=persona.dni;
        email=persona.email;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
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
    
    void Listar(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(dni);
        System.out.println(email);
    }
}
    /*
    //constructores
    Persona(){
        System.out.println("Has creado una persona");
    }
    
    Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    }
    
    OTRA FORMA DE HACERLO PERO MEJOR CON THIS
    
    Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    }
    
    //metodos
    void Saludar (){
        System.out.println(nombre+" te dice hola");
    }
    void Comer(){
        System.out.println("Estoy comiendo");
    }
    void incrementar(int n){
        edad=edad+n;
    }
    
    }
    */
    

