/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas15;

import java.util.Scanner;

/**
 *
 * @author redes
 */
public class Solucion13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner siete = new Scanner(System.in);
        
        int a;
       int residuo;
       
        System.out.println("Ingrese numeros");
        a=siete.nextInt();
        residuo=a%7;
      
        if(residuo==0)
        {
            System.out.println("Su numero es multiplo de 7");
        }
        else
        {
            System.out.println("Su numero NO es multiplo de 7");
        }
    }
    
}
