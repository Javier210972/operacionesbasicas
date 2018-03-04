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
public class Solucion9 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
         Scanner Numero = new Scanner(System.in);
        int a;
        int b;
        int c;
        int ParImpar;
        int ParImparDos;
         int C;
        
     System.out.println("Ingrese primer numero");
         ParImpar = Numero.nextInt();
         System.out.println("Ingrese  segundo numero");
         ParImparDos = Numero.nextInt();
        
          C= ParImpar+ParImparDos;
         
         
        if (C%2==0)
        {
             System.out.println("El numero "+C+" es par");
        }  
        else
        {
            System.out.println("Su numero es impar");
        }
         
         
    
       }}
