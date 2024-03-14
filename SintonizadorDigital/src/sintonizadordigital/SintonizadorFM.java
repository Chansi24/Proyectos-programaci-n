/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital;
//metodo subir y bajar y un display que muestra la frecuencia (80-108mhz)
/**
 *
 * @author Medac
 */
public class SintonizadorFM {
     private double frecuencia;
     
    SintonizadorFM (){
        frecuencia=80;
    }
    SintonizadorFM (double frecuencia){
        this.frecuencia=frecuencia;
    } 
    
    void subir(double n){
        if ((frecuencia+(n*0.5))>108){
            frecuencia =frecuencia+(n*0.5)-28;
        }
        else{
            frecuencia = frecuencia+ (n*0.5);    
        }
    }
    void bajar(double m){
        if ((frecuencia-(m*0.5))<80){
            frecuencia = frecuencia - (m*0.5)+28;
        }
    }
    void display(){
        System.out.println(frecuencia+"Mhz");
    }
    
    
}
