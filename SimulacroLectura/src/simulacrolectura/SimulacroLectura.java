/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrolectura;
import java.io.*;

/**
 *
 * @author Medac
 */
public class SimulacroLectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        File file=new File("inventario.txt");
        FileReader leerinventario;
        BufferedReader bufferinventario;
       // String articulo = "";
        //String[] articulos=new String[100];
        
        
        try{
            
            leerinventario=new FileReader(file);
            bufferinventario= new BufferedReader(leerinventario);
            articulo = bufferinventario.readLine();
            
            while (articulo != null) {
                articulos = articulo.split(":");   
                Producto P = new Producto
        ();
                System.out.println(articulos[0]);                
                articulo = bufferinventario.readLine();
    }
        }
catch(IOException e){
    System.out.println(e.getMessage());
}    
      
       
        
    }
}
