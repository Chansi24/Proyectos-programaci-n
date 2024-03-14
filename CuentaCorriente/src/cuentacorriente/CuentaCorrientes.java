/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentacorriente;

/**
 *
 * @author Medac
 */
public class CuentaCorrientes {
Persona persona;
double saldo;
double limite;



public CuentaCorrientes (double saldo){
    this.saldo=saldo;
}
CuentaCorrientes (Persona persona, double saldo, double limite){
    this(saldo);
    this.persona=persona;
    this.limite = limite;  
}

void ingresar(double n){
    saldo = saldo +n;    
}
void sacardinero (double m){
   if ((saldo-m)<limite){
       System.out.println("No puedes sacar ese dinero");
   }
   else{
       saldo =saldo-m;
   }
}
public void mostrar(){  
    System.out.println("Su saldo es de " +saldo);
    System.out.println("Su limite es de " +limite);
    System.out.println("Su Dni es "+persona.dni);
    System.out.println("Su nombre es "+persona.nombre);
    System.out.println("Su edad es de "+persona.edad+ " años");
    System.out.println("Su correo es "+persona.email);
    
}


}
