/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;
import java.io.*;

/**
 *
 * @author Medac
 */
public class Simulacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  FileReader leerarchivo;
  BufferedReader bufferarchivo;
  String linea="";
   boolean comentadotodo=false;  
  try{
            leerarchivo=new FileReader("coidgosimulacro.txt");
            bufferarchivo= new BufferedReader(leerarchivo);
            linea=bufferarchivo.readLine();
                while (linea!=null) {
                    if((!linea.contains("//"))&&(!linea.contains("/*"))&&(!linea.contains("*/"))&&(!comentadotodo)){
                        System.out.println(linea);
                } 
                    else if (linea.contains("/*")){
                        comentadotodo=true;
                    }
                    else if(linea.contains("*/")){
                        comentadotodo=false;
                    }
                    
                    linea=bufferarchivo.readLine();
                }
  }
  catch(IOException e){
      System.out.println("Error de lectura");
  }
    }
}