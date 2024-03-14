/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SintonizadorFM sintonizador=new SintonizadorFM();
      sintonizador.bajar(5);
      sintonizador.subir(7);
      sintonizador.display();
    }
    
}
