/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrokiko;
import java.io.*;
/**
 *
 * @author Medac
 */
public class SimulacroKiko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file=new File("inventario.txt");
        Articulo[] articulos= new Articulo[10];
        int cont=0;
        
        try{
            FileReader filereader=new FileReader(file);
            BufferedReader bufferedreader= new BufferedReader(filereader);
            String texto=bufferedreader.readLine();
            while(texto!=null){
                String[]array= texto.split(":");
                articulos[cont]=new Articulo(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]));
                cont++;
                texto=bufferedreader.readLine();
            }
            
            bufferedreader.close();
        }
        catch(IOException e){
            System.out.println("Error lectura");
    }
        for (int i = 0; i < articulos.length; i++) {
            if(articulos[i]!=null){
            System.out.println(articulos[i]);
            }
        }
    }
}
