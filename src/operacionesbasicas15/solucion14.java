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
public class solucion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner PI = new Scanner(System.in);
       
         int a;
        System.out.println("Ingrese un numero");
        a = PI.nextInt();
       
         
       
      if (0==(a%2))
        {
            System.out.println("El numero "+a+" Termina con un digito par");
        }  
        else
        {
            System.out.println("Su numero es impar");
        }
    }
    
}
