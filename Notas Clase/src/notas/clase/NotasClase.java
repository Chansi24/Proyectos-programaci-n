/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas.clase;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class NotasClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int respu=0;
    Persona[]alumnos=new Persona[100];
    int pos=0;
    do{
        System.out.println("1.Insertar alumn@, 2.Mostrar Alumnos, 3.Mostrar Alumnas, 4.Mostrar suspensos, 5.Mostrar estadistica, 6.Salir");
     respu=sc.nextInt();
    
     
     switch(respu){
         case 1://Insertar alumn@
             System.out.println("1.Alumno 2.Alumna");
             int res=sc.nextInt();
             System.out.println("Di el nombre");
             if(res==1){
                 alumnos[pos]=new Alumno(sc.next());
                 alumnos[pos].insertarnotas();
                 alumnos[pos].estaaprobado();
             }
             else{
                 alumnos[pos]=new Alumna(sc.next());
                 alumnos[pos].insertarnotas();
             }
             pos++;
             break;
         case 2: //Mostrar alumnos
             for (int i = 0; i < alumnos.length; i++) {
                 if (alumnos[i]instanceof Alumno) {
                     System.out.println(alumnos[i]);
                 }    
             }
             break;
         case 3:
             for (int i = 0; i < alumnos.length; i++) {
                 if (alumnos[i]instanceof Alumna) {
                     System.out.println(alumnos[i]);
                 }    
             }
             break;
         case 4:
             System.out.println("1.Alumnos 2.Alumnas");
             int respuesta=sc.nextInt();
             for (int i = 0; i < pos; i++) {
                 alumnos[i].estaaprobado();
                 if(respuesta==1){//niños
                     if(alumnos[i]instanceof Alumno && alumnos[i].isSuspenso()){
                         System.out.println(alumnos[i]);
                     }
                 }
                 if(respuesta==2){//niñas
                     if(alumnos[i]instanceof Alumna && alumnos[i].isSuspenso()){
                         System.out.println(alumnos[i]);
                     }
                 }
             }
             break;
         case 5:
             int contmasc=0;
             int contfem=0;
             for (int i = 0; i < pos; i++) {
                 if (alumnos[i].isSuspenso() && alumnos[i]instanceof Alumno){
                     contmasc++;
                 }
                 else if(alumnos[i].isSuspenso()&&alumnos[i]instanceof Alumna){
                     contfem++;
                 }
                 
             }
             System.out.println("Alumnos Chicos"+contmasc+"Alumnas Chicas");
             break;
         case 6:
             break;     
     }
    }
    while (respu!=6);
    }
    
}
