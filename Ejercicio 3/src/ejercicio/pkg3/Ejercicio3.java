/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner tc=new Scanner(System.in);
 
/* 
 double real;
 System.out.println("Porcentaje de accidentes viales estimados con decimales?");
 real=tc.nextDouble();
 
 real=real+0.5;
int numeroRedondo=(int)real;

 System.out.println("El número redondeado es: "+numeroRedondo);
 */

/*
double radio;
System.out.println("Introducel el radio del círculo");
radio=tc.nextDouble();

double area=Math.PI*Math.pow(radio, 2);
System.out.println("El área del círculo es: "+Math.round(area));

double longitud=2*Math.PI*radio;
System.out.println("La longitud del círculo es: "+Math.round(longitud));
*/

double segundos,hora,minutos;
System.out.println("Introduce la cantidad de segundos");
segundos=tc.nextDouble();

minutos=segundos/60;
segundos=segundos%60;
hora=minutos/60;
minutos=minutos%60;
int horaRedondeo=(int)hora;
int minutosRedondeo=(int)minutos;
int segundosRedondeo= (int)segundos;

System.out.println(horaRedondeo+"hs "+minutosRedondeo+"min "+segundosRedondeo+"seg ");
 
    }
    
}
