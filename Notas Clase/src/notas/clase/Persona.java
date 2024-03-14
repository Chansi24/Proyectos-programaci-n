/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas.clase;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public abstract class Persona {
Scanner sc = new Scanner(System.in);
protected String nombre;
protected double[] notas;
boolean suspenso = false;

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }
    
//Constructor
public Persona (String nombre){
    this.nombre=nombre;
    notas=new double[6];
}
//metodos
public void insertarnotas(){
    String[]nombre={"Programación","BBDD","Lenguaje","fol","entornos","sistemas"};
    for (int i=0;i<notas.length;i++){
        System.out.println("Cual es la nota de "+nombre[i]);
        notas[i]= sc.nextDouble();
    }   
}
public void estaaprobado(){
    for (int i=0;i<notas.length;i++){
        if(notas[i]<5){
            suspenso=true;            
        }
    }
    
}
@Override
public String toString(){
    String respuest="";
    for(int i=0;i<notas.length;i++){
        respuest=respuest+notas[i]+"||";
    }
    return nombre+respuest;
}

}
