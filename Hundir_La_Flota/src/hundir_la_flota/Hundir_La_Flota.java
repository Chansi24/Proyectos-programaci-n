/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundir_la_flota;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Hundir_La_Flota {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

     /*mostrarMatriz(tablero);*/  
       //declaramos array tablero
       char[][] tablero=new char[10][10];
       char[][] tablero_copia=new char[10][10];
       int contB1=5,contB2=3,contB3=1;
       //rellena
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[0].length;j++){
                    tablero[i][j]='*';
                }
    }
            
               //rellena
            for(int i=0;i<tablero_copia.length;i++){
                for(int j=0;j<tablero[0].length;j++){
                    tablero[i][j]='*';
                }
    }
            mostrar(tablero);      
            
            System.out.println("-----------");           
            //declaramos arrays de barcos          
        introducirBarco(tablero, 5,'B');
        introducirBarco(tablero, 3,'C');
        introducirBarco(tablero, 1,'D');
        mostrar(tablero); 
        int barcob=5,barcoc=3,barcod=1;
        //jugar
        do{
            
            System.out.println("aqui");
           //pedir coordenada usuario
            System.out.println("introduce coordenada X. ");
            int coordenadaX = sc.nextInt();
            System.out.println("Introduce coordenada Y. ");
            int coordenadaY = sc.nextInt();
            
            char letra = tablero [coordenadaX][coordenadaY];
            switch (letra){
                case '*':
                    System.out.println("Agua");
                    break;
                case 'B':
                    barcob--;
                    tablero_copia [coordenadaX][coordenadaY] = 'T';
                    tablero [coordenadaX][coordenadaY] = 'T';
                    
                    break;
                    
                    case 'C':
                        barcoc--;
                    tablero_copia [coordenadaX][coordenadaY] = 'T';
                    tablero [coordenadaX][coordenadaY] = 'T';
                    break;
                    case 'D':
                        barcod--;
                    tablero_copia [coordenadaX][coordenadaY] = 'T';
                    tablero [coordenadaX][coordenadaY] = 'T';
                    break;
                
            }
               
            
           //comprobar en tablero si has tocado barco o no
           
           
        }while(!((barcob==0)&&(barcoc==0)&&(barcod==0)));
        mostrar (tablero_copia);
        System.out.println("FIN");
        
    }
    //funciones
    
    //mostrar matriz
    
     public static void mostrar(char [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
     //rellenar matriz
     public static void rellenar(char[][] a){
         for(int fila=0;fila<a.length;fila++)
             Arrays.fill(a[fila], '*');
     }    
     //introducir barco     
     public static void introducirBarco(char[][] m,int tamaño, char letra){
      boolean  condicion;
      int posx,posy;      
      do{
      condicion=false;
      posx=(int) (Math.random()*10);
      posy=(int) (Math.random()*10);
      if(posy+tamaño<m[0].length){
          condicion=true;
           //comprobar que no coincidan barcos
           for (int i=0;i<tamaño;i++){
               if(m[posx][posy+i]!='*'){
                   condicion=false;
               }
           }
           if(condicion==true){
               for(int i=0;i<tamaño;i++){
                   m[posx][posy+i]=letra;
               }
           }
        }
      }
      while(!condicion);
}
}
