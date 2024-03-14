/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Coche coche=new Coche();
    Moto moto=new Moto();
    Camion camion=new Camion();
    Vehiculo[]vehiculos={coche, moto , camion};
    //Creacion de circuito
    Vehiculo[][] circuito=new Vehiculo[3][10];
    for (int i=0;i<circuito.length;i++)
         {
             for(int j=0;j<circuito[0].length;j++)
             {
                 circuito[i][j]=null;
             }
         }
    circuito[0][0]=coche;
    circuito[1][0]=moto;
    circuito[2][0]=camion;
        
    
    //Creacion de cartas objetivo
    String[]CartaObjetivo={"1camion2moto","1coche2camion","1moto3camion"};
        for (int i = 0; i < 3; i++) {
            if (i==0){
            int rand=(int)(Math.random()*3);
            System.out.println("El objetivo del camión es "+ CartaObjetivo[rand]);
            CartaObjetivo[rand]=null;
            }
            if (i==1){
                
                int rand=(int)(Math.random()*3);
                if(CartaObjetivo[rand]!=null){    
                System.out.println("El objetivo de la moto es "+ CartaObjetivo[rand]);
                CartaObjetivo[rand]=null;
            }
            }
            if (i==2){
                int rand=(int)(Math.random()*3);
                if(CartaObjetivo[rand]!=null){    
                System.out.println("El objetivo del coche es "+ CartaObjetivo[rand]);
                CartaObjetivo[rand]=null;
                
            }
        }
            
    
    
        } 
        
        
     
       //comienza el juego
       
        do{
            for (int filas=0;filas<circuito.length;filas++)
         {
             System.out.println(Arrays.toString(circuito[filas]));
         }
            int avan=(int)(Math.random()*2);
            if (avan==0){
                System.out.println("Quien quieres que retroceda? 1.coche 2.moto 3.camion");
                int resp=sc.nextInt();
                switch(resp){
                    case 1:
                       // if(coche.getPosx()>0||coche.getPosx()<10){
                        circuito[coche.getPosy()][coche.getPosx()]=null;
                        coche.retroceder();
                        circuito[coche.getPosy()][coche.getPosx()]=coche;    
                       // }
                        
                       // if(coche.getPosx()<3){
                           // System.out.println("No puedes hacer eso"); (lo comentado era un intento de que no diera error al salir del array pero no lo he conseguido)
                       // }
                        
                        break;
                    case 2:
                        circuito[moto.getPosy()][moto.getPosx()]=null;
                        moto.retroceder();
                        circuito[moto.getPosy()][moto.getPosx()]=moto;
                        break;
                    case 3:
                        circuito[moto.getPosy()][moto.getPosx()]=null;
                        camion.retroceder();
                        circuito[camion.getPosy()][camion.getPosx()]=camion;
                        break;
                    
                }
                       
            }
            if (avan==1){
                System.out.println("Quien quieres que avance? 1.coche 2.moto 3.camion");
                int resp=sc.nextInt();
                switch(resp){
                    case 1:
                        circuito[coche.getPosy()][coche.getPosx()]=null;
                        coche.avanzar();
                        circuito[coche.getPosy()][coche.getPosx()]=coche;
                        break;
                    case 2:
                        circuito[moto.getPosy()][moto.getPosx()]=null;
                        moto.avanzar();
                        circuito[moto.getPosy()][moto.getPosx()]=moto;
                        break;
                    case 3:
                        circuito[moto.getPosy()][moto.getPosx()]=null;
                        camion.avanzar();
                        circuito[camion.getPosy()][camion.getPosx()]=camion;
                        break;
            }
           
       }
        }
       while (camion.getPosx()<10||coche.getPosx()<10||moto.getPosx()<10);
      
        
    

    }
    
}
