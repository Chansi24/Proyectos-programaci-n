/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Array5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String palabra;
        palabra = sc.next();
        String[] xd = new String[palabra.length()];

        String letra = null;

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < palabra.length(); i++) {
            xd[i] = "-";

        }
        System.out.println(Arrays.toString(xd));

        int vidas = 5;
        boolean malo;
        System.out.println("Tienes 5 vidas");
        for (int i = 0; i < palabra.length(); i++) {
            malo = false;
            System.out.println("Elije letra");
            letra = sc.next();
            if (palabra.contains(letra)) {
                int lmao = palabra.indexOf(letra);
                int lmfao = palabra.lastIndexOf(letra);

                xd[lmao] = letra;
                xd[lmfao] = letra;

                System.out.println(Arrays.toString(xd));
                for (int t = 0; t < xd.length; t++) {
                    sb.append(xd[t]);
                }
                String str = sb.toString();
                if (str.substring(str.length() - palabra.length()).equals(palabra)) {
                    System.out.println("Ganaste");
                    System.exit(1);
                }
            } else {
                System.out.println("Incorrecto");
                i = i - 1;
                malo = true;
                if (malo = true) {
                    vidas = vidas - 1;
                    System.out.println("Te quedan " + vidas + " vidas");
                    if (vidas == 0) {
                        System.out.println("Perdiste");
                       
                    }
                }
            }
        }
    }
}
  
