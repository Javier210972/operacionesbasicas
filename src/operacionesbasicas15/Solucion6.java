/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas15;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author toshiba2
 */
public class Solucion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Triangulo = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        
        
        
        System.out.println("¿Cuales son las Dimensiones del Triangulos?");
        System.out.println("Base");
        a= Triangulo.nextInt();
        System.out.println("Cateto opuesto");
        b= Triangulo.nextInt();
        c= sqrt((a*a)+(b*b));
     
         System.out.printf("La hipotenua es:" + " %.2f ", c);
        System.out.println("");
         
    }

    private static double raiz(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
