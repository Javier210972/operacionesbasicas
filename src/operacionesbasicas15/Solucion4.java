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
public class Solucion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Potencia = new Scanner(System.in);
        int a;
        int b;
        
        System.out.println("¿Que numero quiere elevar a la quinta potencia?");
        a = Potencia.nextInt();
        b = (a)*a*a*a*a;
           System.out.println("Su numero elevado es: "+b);
        
        
        
        
        
        
    }
    
}
