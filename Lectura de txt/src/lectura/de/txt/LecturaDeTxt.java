/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectura.de.txt;
import java.io.*;

/**
 *
 * @author Medac
 */
public class LecturaDeTxt {
    
public static void main(String[] args) {
        FileReader insultosreader;
        BufferedReader insultosbuffer;
        String palabra = "";
//        String insulto=" ";
//        String alago=" ";
        FileReader frasereader;
        BufferedReader frasebuffer;
        String stringdefrase = " ";
        String[] palabras;
        String[] insulto = new String[22];
        String[] alago = new String[22];
        try {
            frasereader = new FileReader("mensajecbron.txt");
            frasebuffer = new BufferedReader(frasereader);
            stringdefrase = frasebuffer.readLine();
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
        try {
            insultosreader = new FileReader("palabrotas.txt");
            insultosbuffer = new BufferedReader(insultosreader);
            palabra = insultosbuffer.readLine();
            System.out.println(palabra.length());
            while (palabra != null) {
                palabras = palabra.split(";");
                
                for (int i = 0; i < palabras.length; i++) {
                    System.out.println(palabras[i]);
                }
                palabra = insultosbuffer.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error de lectura");
        }

    }

}
