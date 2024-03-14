/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaexamen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Medac
 */
public class Pruebaexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codi=0;
        for (int i = 0; i < 10; i++) {
            
        
            int cont=0;
            
    try{
                    File fileid=new File("config.txt");
                    FileReader readerid=new FileReader(fileid);
                    BufferedReader bufferid= new BufferedReader(readerid);                    
                    String idconf=bufferid.readLine();
                    
                   
                    codi++;
                    
                    FileWriter filecodi=new FileWriter("config.txt",true);
                    BufferedWriter escribecodi=new BufferedWriter(filecodi);
                    escribecodi.write(codi);
                    System.out.println(codi);
                    
    }
    catch(IOException e){
            System.out.println("Error lectura");
        }
        }
        
    
}
}
