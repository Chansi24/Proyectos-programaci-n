/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adndierna;
import java.io.*;
/**
 *
 * @author Medac
 */
public class ADNdierna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int j=0;
        String cadena2;
        try{
            File cadenafile=new File("CADENAADN.txt");
                    FileReader readercadena=new FileReader(cadenafile);
                    BufferedReader buffercadena= new BufferedReader(readercadena);                    
                    String cadena=buffercadena.readLine();                    
                    String[]cadenaadn= cadena.split("CAAT");                   
                    if (cadenaadn.length>1){
                    System.out.println("Tiene "+ ((cadenaadn.length)-1)+" veces repetidas la subcadena CAAT");
                        System.out.println("Vamos a cambiar el ADN......");
                        System.out.println("Y este es tu nuevo ADN CRACK:");
                    cadena2=cadena.replaceAll("CAAT", "ACAT"); 
                        System.out.println(cadena2);
                    
                    FileWriter fileadn=new FileWriter("CADENAADN.txt",false);
                    BufferedWriter escribeadn=new BufferedWriter(fileadn);
                    escribeadn.write(cadena2);
                    escribeadn.close();
        }
                    if (cadenaadn.length==1){
                    System.out.println("No tiene dierna");
        }
                   
        }
        catch(IOException e){
            System.out.println("Error lectura");
        }
    }
    
}
