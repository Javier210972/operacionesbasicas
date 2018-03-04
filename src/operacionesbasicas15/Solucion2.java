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
public class Solucion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ingreso = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        double e;
        int f;
        
        
    System.out.println("CALCULARODA");             
    System.out.println("Ingrese 2 digitos para sumarlos");
     a =Ingreso.nextInt();
     b =Ingreso.nextInt();
     c = a+b;
     d = a-b;
     f = a*b;
     e = (double)a/b;
     
    System.out.println("el resultado de la suma es: "+c);
   
    System.out.println("el resultado de la resta es: "+d);
    System.out.println("el resultado de la multiplicacion es: "+f);
   
    System.out.printf("el resultado de la division es: " + " %.2f ", e);
    System.out.println("");
    
   
    
    
        
    }
    
}
