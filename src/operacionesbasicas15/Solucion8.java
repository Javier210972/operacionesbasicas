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
public class Solucion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         Scanner Signo = new Scanner(System.in);
        int a;
        int b ;
        int c;
        
        
       
         System.out.println("Ingrese numero ");
         a = Signo.nextInt();
        
         
        
         
        if(a>0)
        {
            System.out.println("Su numero es positivo" );
        }
         else if(a==0){
             System.out.println("Su numero es neutro" );
            
        }
        else if(a<0){
             System.out.println("Su numero es negativo" );
            
        }
    }}
