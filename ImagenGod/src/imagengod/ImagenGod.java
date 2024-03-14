/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imagengod;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

/**
 *
 * @author Medac
 */
public class ImagenGod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[][] matriz=new int[15][15];
    for (int i=0;i<matriz.length;i++)
         {
             for(int j=0;j<matriz[0].length;j++)
             {
                 matriz[i][j]=1;
             }
         }
        for (int i = 1; i < 11; i++) {
            matriz[i][5]=255;
        }
        for (int i = 6; i < 8; i++) {
            matriz[0][i]=255;
        }
        for (int i = 1; i < 11; i++) {
            matriz[i][8]=255;
        }
        matriz[3][7]=255;
        matriz[3][6]=255;
        
        matriz[11][6]=255;
        matriz[12][6]=255;
        matriz[13][5]=255;
        matriz[13][4]=255;
        matriz[12][3]=255;
        matriz[11][3]=255;
        matriz[10][4]=255;
        
        matriz[11][9]=255;
        matriz[12][9]=255;
        matriz[13][8]=255;
        matriz[13][7]=255;
        matriz[12][6]=255;
        matriz[11][6]=255;
        matriz[10][7]=255;
        
    for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    
    BufferedImage imagen=new BufferedImage(matriz.length,matriz[0].length, BufferedImage.TYPE_INT_ARGB);
    for (int i=0;i<matriz.length;i++)
         {
             for(int j=0;j<matriz[0].length;j++)
             {
                 int gris=matriz[i][j];
                 Color color=new Color(gris,gris,gris);
                 imagen.setRGB(i,j,color.getRGB());
             }
         }
    try{
        ImageIO.write(imagen,"png",new File("imagen.png"));
    }
    catch(IOException e){
        System.out.println("");
    }
    }
    
}
