/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto_fp;

/**
 *
 * @author Sathell
 */
public class PrimerProyecto_FP {

     int a = 0;
    double d = 0.0;
    char c = 'c';
    String str = "hello world";
    boolean v = false;
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        String cad = "Hello world ";
        System.out.println(cad);
        imprimirNombre();        
        //sumar2numeros(1,2);
        System.out.println(sumar2numeros(1,2));
    }
     public static void imprimirNombre (){
         System.out.println("Fundamentos \nProgramacion");
         System.out.println("Javi\ter");
         String nm = "Javier";
         String nm2 = " Javier ";
         String nm3 = "javier";
         String nm4 = "JAVIER";
         String nm5 = "Edison";
         System.out.println(nm.length());
         //trim elimina los espacios
         System.out.println(nm2.trim());
         System.out.println(nm3.toUpperCase());
         System.out.println(nm4.toLowerCase());
          //replace remplaza un caracter o cadena por otra
         System.out.println(nm4.replace(nm4, nm5));
         //split divide los caracteres de una cadena
         System.out.println(nm4.split(" "));
         //indexOf 
         }
     
     public static int sumar2numeros (int num1, int num2){
         int suma = num1 + num2;
         return suma;  
         }
}
