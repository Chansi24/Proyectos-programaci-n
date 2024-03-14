/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;

/**
 *
 * @author Medac
 */
public class Carta {
    int vida;
    int ataque;
public Carta(int vida, int ataque){
    this.vida=vida;
    this.ataque=ataque;    
} 
@Override
    public String toString() {
        return "Carta{" + "vida=" + vida + ", ataque=" + ataque + '}';
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

    

    

