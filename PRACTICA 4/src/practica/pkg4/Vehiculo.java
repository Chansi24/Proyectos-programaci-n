/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg4;

/**
 *
 * @author Medac
 */
public abstract class Vehiculo {

    @Override
    public String toString() {
        return  nombre;
    }
protected String nombre;
protected int posx;
protected int posy;
protected int av;
public void avanzar(){
    posx=posx+av;
    posy=posy;
}
public void retroceder(){
    posx=posx-av;
    posy=posy;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setAv(int av) {
        this.av = av;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public int getAv() {
        return av;
    }
    


}


