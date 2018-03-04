/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas15;

import java.util.Scanner;

/**
 *
 * @author toshiba2
 */
public class Solucion5 {

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
        System.out.println("Altura");
        b= Triangulo.nextInt();
        c= (a*b)/2;
        System.out.printf("La base es: " + "%.2f", c);
        System.out.println("");
        
        
        
    }
    
}
