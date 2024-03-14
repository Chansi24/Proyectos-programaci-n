/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_fernandez_cano_pract5;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Practica5_Fernandez_Cano_pract5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resp=0;
        int cont=0;
        int codi=1;
        do{
        Scanner sc= new Scanner(System.in);
        FileWriter filepaci;
        BufferedWriter escribepaci;
        System.out.println("Elige una opción: 1.Crear paciente, 2.Ver pacientes, 3.Sondaje, 4.Salir");
        resp = sc.nextInt();
        Paciente[] pacientes= new Paciente[codi];
        
        switch(resp){
            
            case 1:
                System.out.println("Introduzca el nombre del paciente");
                String nomb= sc.next();
                System.out.println("Introduzca el apellido del paciente");
                String ape= sc.next();
                System.out.println("Introduzca la edad del paciente");
                String edad=sc.next();
                /*try{
                    int edad2 = Integer.parseInt(edad);
                }
                catch(IOException e){
            System.out.println("Error lectura");
        }
                ESTO ERA UN INTENTO DE HACER LA EXCEPCION PERO NO SE COMO SE HACE, PERDONA KIKO TE HE FALLADO
                
*/ 
                
                try{
                    File fileid=new File("config.txt");
                    FileReader readerid=new FileReader(fileid);
                    BufferedReader bufferid= new BufferedReader(readerid);                    
                    String idconf=bufferid.readLine();                   
                    
                    
                              
                    filepaci=new FileWriter("pacientes.txt",true);
                    escribepaci=new BufferedWriter(filepaci);
                    pacientes[cont]=new Paciente(codi,nomb,ape,edad);           
                    escribepaci.write("ID: "+pacientes[cont].id + " NOMBRE Y APELLIDO: "+ pacientes[cont].nombre + " "+ pacientes[cont].apellido );
                    escribepaci.newLine();
                    cont++;
                    
                    FileWriter filecodi=new FileWriter("config.txt",false);
                    BufferedWriter escribecodi=new BufferedWriter(filecodi);
                    escribecodi.write(codi);
                    codi++;
                    
                    
                escribepaci.close();
                escribecodi.close();
                }
            catch(IOException e){
            System.out.println("Error lectura");
        }
         break;
         
         case 2:
             try{
                    File file=new File("pacientes.txt");
                    FileReader filereader=new FileReader(file);
                    BufferedReader bufferedreader= new BufferedReader(filereader);
                    String texto=bufferedreader.readLine();
                    
                    while(texto!=null){
                    System.out.println(texto);
                    texto=bufferedreader.readLine();
                    }
                    bufferedreader.close();
             }
             catch(IOException e){
            System.out.println("Error lectura");
        }
             break;
         case 3: 
                try{
                    FileReader filesonda=new FileReader("sondaje.txt");
                    BufferedReader buffersonda= new BufferedReader(filesonda);
                    String sondaje=buffersonda.readLine();
                    String[]arraysondaje= sondaje.split(" ");
                    System.out.print("Han sangrado los dientes: ");
                    for (int i = 0; i <arraysondaje.length; i++) {
                        if(arraysondaje[i].contains("+")){
                            String textoarray=arraysondaje[i];
                            String textoarray2=textoarray.substring(1);
                           
                            System.out.print(textoarray2+", ");
                            
                        }
                    }
                    System.out.println(" ");
 
                    String sondaje2=sondaje.substring(2);
                    
                 
             }  
             catch(IOException e){
            System.out.println("Error lectura");
             }
                break;
    }
        }
        while(resp!=4);
}
}
