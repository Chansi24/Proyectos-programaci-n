/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Practica3 {
    
    
    
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);


    Jugador j1=new Jugador ("Musampa","Centrocampista",14000000);
    Jugador j2=new Jugador ("Herrero","Portero",2000000);
    Jugador j3=new Jugador ("Juande","Defensa",3000000);
    Jugador j4=new Jugador ("victor","Defensa",1000000);
    Jugador j5=new Jugador ("Einar","Defensa",500000);
    Jugador j6=new Jugador ("Gabilondo","Defensa",5500000);
    Jugador j7=new Jugador ("Ramon","Centrocampista",4000000);
    Jugador j8=new Jugador ("Kevin","Delantero",6000000);
    Jugador j9=new Jugador ("Larrubia","Centrocampista",540000);
    Jugador j10=new Jugador ("Roberto","Delantero",7000000);
    Jugador j11=new Jugador ("Dioni","Delantero",1500000);
    Jugador j12=new Jugador ("Sangalli","Centrocampista",250000);
    Jugador j13=new Jugador ("Nelson","Defensa",100000);
    Jugador j14=new Jugador ("Loren","Delantero",50000);
    Jugador j15=new Jugador ("Haitam","Delantero",2000000);
    Jugador j16=new Jugador ("Genaro","Centrocampìsta",1000000);
    Jugador j17=new Jugador ("Juan","Centrocampista",500000);
    Jugador j18=new Jugador ("Molina","Centrocampista",500000);
    Jugador j19=new Jugador ("Messi","Delantero",100000000);
    Jugador j20=new Jugador ("Weligton","Defensa",20000000);
    Jugador j21=new Jugador ("Cristiano","Delantero",90000000);
    Jugador j22=new Jugador ("Kameni","Portero",15000000);
        
     
    Jugador [] arrayplantilla=new Jugador [22];
    arrayplantilla [0]= j1;
    arrayplantilla [1]= j2;
    arrayplantilla [2]= j3;
    arrayplantilla [3]= j4;
    arrayplantilla [4]= j5;
    arrayplantilla [5]= j6;
    arrayplantilla [6]= j7;
    arrayplantilla [7]= j8;
    arrayplantilla [8]= j9;
    arrayplantilla [9]= j10;
    arrayplantilla [10]= j11;
    arrayplantilla [11]= j12;
    arrayplantilla [12]= j13;
    arrayplantilla [13]= j14;
    arrayplantilla [14]= j15;
    arrayplantilla [15]= j16;
    arrayplantilla [16]= j17;
    arrayplantilla [17]= j18;
    arrayplantilla [18]= j19;
    arrayplantilla [19]= j20;
    arrayplantilla [20]= j21;
    arrayplantilla [21]= j22;
    
    Jugador [] arrayequipo=new Jugador[11];
    for(int i=0;i<11;i++){
    int fichaje =(int)(Math.random()*22);
    if(arrayplantilla[fichaje]!=null){
    	 arrayequipo[i]=arrayplantilla[fichaje];
         arrayplantilla[fichaje]=null;
    }
         else {
       arrayequipo[i]=arrayequipo[i];
       i--;
    }
        
    }
    boolean salir = true;
    do{
        System.out.println("Que quieres hacer? 1.Mostrar plantilla 2.Cambiar Jugador 3.Valor de equipo 4.Salir");
        int eleccion = sc.nextInt();
        switch(eleccion){
    case 1:
    for (int a=0; a<11; a++){
        System.out.println(a+" Nombre = "+arrayequipo[a].getNombre() + ", posición = "+arrayequipo[a].getPos()+", precio = "+arrayequipo[a].getPrecio());
    }
        break;
    
    case 2:
        System.out.println("Jugadores disponibles para fichar:");
    for (int i=0;i<22;i++) {
        if(arrayplantilla[i]!=null){
            System.out.println(i + arrayplantilla[i].getNombre()+", "+ arrayplantilla[i].getPos()+ ", "+arrayplantilla[i].getPrecio());
        }
        else{
            i=i;
        }
        
    }  
        System.out.println("Jugadores en tu plantilla:");
        for (int a=0; a<11; a++){
        System.out.println(a+arrayequipo[a].getNombre() + ", "+arrayequipo[a].getPos()+", "+arrayequipo[a].getPrecio());
    }
        System.out.println("Elige la posición de los disponibles que quieras en tu equipo");
        int fichaje1 = sc.nextInt();
        System.out.println("Elige que jugador de tu equipo quieres cambiar");
        int venta = sc.nextInt();
        arrayequipo[venta]= arrayplantilla[fichaje1];
        System.out.println("Tu nueva plantilla es: ");
        for (int a=0; a<11; a++){
        System.out.println(a+arrayequipo[a].getNombre() + ", "+arrayequipo[a].getPos()+", "+arrayequipo[a].getPrecio());
    }
        break;
          
    case 3:
        int suma =0;
        for (int i=0; i<11; i++){
            
        suma =arrayequipo[i].getPrecio() + suma;
            
    }
        System.out.println("El valor total de su equipo es: "+suma);
        break;
     
    case 4:
        salir = false;
        break;
        }                                  
        }
    while (salir);
        
    
       
    
    
    
    
    
    
    
    


    
    
        
    }
    
}
