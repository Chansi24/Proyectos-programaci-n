/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacorriente;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class CuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    Persona persona1 = new Persona ("Juan",18,"44665509s","juanillo@gmail.com");
    CuentaCorrientes cuentacorriente1 = new CuentaCorrientes (persona1,1000,50);
    cuentacorriente1.mostrar();
   
   
    
    }
    
}
