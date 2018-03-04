/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas15;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author redes
 */
public class Solucion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ingreso = new Scanner(System.in);
        int a;
        int b;
        int c;     
        int d;
        int e;       
        int f; 
        double g;
        
        
                 
    System.out.println("Ingrese los 5 numeros");
     a =Ingreso.nextInt();
     b =Ingreso.nextInt();
     c =Ingreso.nextInt();
     d =Ingreso.nextInt();
     e =Ingreso.nextInt();
     f= a+b+c+d+e;
     g= (double)f/5;
       System.out.println("La suma es: "+f);
       System.out.printf("Su promedio es:" + " %.2f ", g);
       System.out.println("");
       
      
     
     
        
       
        
        
        
        
    }
    
}
