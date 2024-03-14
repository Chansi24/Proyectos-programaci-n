/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cluedo;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Cluedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Persona [] arraypersona=new Persona [6];
    Persona mayordomo= new Persona("mayordomo", false, "hallentrada");
    arraypersona [0]= mayordomo;
    Persona amadellaves= new Persona("amadellaves", false, "dormitorio");
    arraypersona [1]= amadellaves;
    Persona jardinero= new Persona("jardinero", false, "jardin");
    arraypersona [2]= jardinero;
    Persona cocinero= new Persona("cocinero", false, "cocina");
    arraypersona [3]= cocinero;
    Persona propietario= new Persona("propietario", false, "salon");
    arraypersona [4]= propietario;
    Persona esposapropietario= new Persona("esposapropietario", false, "baño");
    arraypersona [5]= esposapropietario;
    
    int ase=(int)(Math.random()*6);
    arraypersona[ase].asesino(true);
        //System.out.println(arraypersona[ase].getNombre());
    boolean win =false;
    
    do{
        System.out.println("Que vamos a hacer primo? 1.Resolver 2.Preguntar a algun sospechoso");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Quien es?");
                String ases = sc.next();
                if (ases.equalsIgnoreCase(arraypersona[ase].getNombre())){
                    System.out.println("Has ganado");
                    win=true;
                }
                else{
                    System.out.println("Ese no es, has perdido");
                    win=true;
                }
                break;
                
            case 2 :
                System.out.println("Con quien quieres hablar? 1.mayordomo 2.ama de llaves 3.jardinero 4.cocinero 5.propietario 6.laesposa");
                int hablar = sc.nextInt();
                hablar--;
                if (arraypersona[hablar].getAsesino()==false){
        
        System.out.println("estaba en "+ arraypersona[hablar].getLugar());
    }
                else arraypersona[hablar].dondeestabas();
        }
                
    }
    while(win==false);
    
    
    }
}
