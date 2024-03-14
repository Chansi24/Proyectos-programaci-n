/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;

/**
 *
 * @author Medac
 */
public abstract class Jugador {
    protected int vida;
    protected int ataque;
    protected boolean vivo;
    protected int size;
    Carta[]cartas;    
    
    //constructor
    public Jugador(){
        vivo=true;
        cartas=new Carta[100];
    }
    //metodo
    public void robarcarta(Carta carta){
       cartas[size]=carta;
            size++;
            }
                 
    
    public void vercartas(){
        for (int i = 0; i < cartas.length; i++) {
           if(cartas[i]!=null){
            System.out.println(cartas[i]+" pos "+i);
           }
        }
    }
    public void usarcarta(int pos){
        vida=vida+cartas[pos].getvida();
        ataque=ataque+cartas[pos].getataque();
        
    }
    public int getvida() {
        return vida;
    }

    public int getataque() {
        return ataque;
    }

    public void setvida(int vida) {
        this.vida = vida;
    }

    public void setataque(int ataque) {
        this.ataque = ataque;
    }

    
}
