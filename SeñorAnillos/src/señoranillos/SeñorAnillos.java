/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package señoranillos;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class SeñorAnillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Aragorn aragorn=new Aragorn();
    Legolas legolas=new Legolas();
    Gimli gimli=new Gimli();
    Orco orco =new Orco();
    Jugador[]jugadores={aragorn, legolas, gimli};
    Carta[]mazo=new Carta[10];
        for (int i = 0;i < mazo.length ; i++) {
            int ataque=(int)(Math.random()*10);
            int vida=(int)(Math.random()*10);
            mazo[i]=new Carta(ataque, vida);
        }
    do{
        for (int i = 0; i < jugadores.length; i++) {
            int random=(int)(Math.random()*10);
            jugadores[i].robarcarta(mazo[random]);
            jugadores[i].vercartas();
            System.out.println("Que quieres hacer? 1.Jugar carta 2.Pelear");
            int resp=sc.nextInt();
            switch(resp){
                case 1: //usar carta
                    System.out.println("Que posicion de carta quieres usar?");
                    int respuesta=sc.nextInt();
                    jugadores[i].usarcarta(respuesta);
                    break;
                
                case 2: //atacarrrrrr
                    orco.setvida(orco.getvida()-jugadores[i].getataque());
                    break;
            }           
        }
        //orco
        int rand=(int)(Math.random()*3);
        jugadores[rand].setvida(jugadores[rand].getvida()-orco.getataque());
    } 
    while ((jugadores[0].getvida()>0)||(jugadores[1].getvida()>0)||(jugadores[2].getvida()>0)||orco.getvida()>0);
    }
    
}
