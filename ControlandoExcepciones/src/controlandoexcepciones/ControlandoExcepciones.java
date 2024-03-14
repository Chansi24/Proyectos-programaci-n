/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlandoexcepciones;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Medac
 */
public class ControlandoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*int a =5;
    int b=0;
    try{
        System.out.println(a/b);
        System.out.println("Entrando por el final del try");
    }
    catch (Exception e){
        System.out.println("No se puede dividir entro 0");                
    } 
        System.out.println("Saliendo del programa");
    
    Scanner scanner = new Scanner(System.in);
    int num;
    int[]array={2,3,7};
        System.out.println("Introduce un numero");
        try{
            num=scanner.nextInt();
            System.out.println(array[num]/num);
            System.out.println("final del try");
        }
        catch(ArithmeticException ex){
            System.out.println("error por dividir entre 0");
            //ex.printStackTrace();
            //System.out.println(ex.toString());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Eror tamaño array");
        }
        catch(InputMismatchException e3){
            System.out.println(e3.toString());
        }
        finally{
            System.out.println("Entrando al finally");
        }
        System.out.println("continuamos");*/
    int num;
    int[]array={2,3,7};
    System.out.println("Introduce un numero");
    try{
    division(array);
    }
    catch(ArithmeticException e){
        System.out.println("por dividir");
    }

    
    
   
    
}
    public static void division(int[]array)throws ArithmeticException{
        //try{
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println(array[num]/num);
        System.out.println("Final del try");
        if(num>2){
            throw new ArrayIndexOutOfBoundsException();
        }
        
        //}
    
    //catch(ArithmeticException e){
        //System.out.println("Error por division");
    //}
    }
    
}
