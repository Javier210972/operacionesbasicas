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
public class Solucion11 {

    /**
     * @param args the command line arguments
     */String i;
    public static void main(String[] args) {
           Scanner Numero = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int contar = 0;
         int contar2 = 0;
          int contar3 = 0;
        
     System.out.println("Ingrese 5 Numeros");
         a = Numero.nextInt();
         b = Numero.nextInt();
         c = Numero.nextInt();
         d = Numero.nextInt();
         e = Numero.nextInt();
        
        
          System.out.println("");
         
         
       if(a>0)
        {
            System.out.println(+a+" es positivo" );
            contar = contar + 1; 
            
           
            
        }
        if(b>0)
        {
            System.out.println(+b+" es positivo" );
           contar = contar + 1; 
           
           
        }
        if(c>0)
        {
            System.out.println(+c+" es positivo" );
           contar = contar + 1; 
          
           
        } 
         if(d>0)
        {
            System.out.println(+d+" es positivo" );
           contar = contar + 1; 
           
            
        } 
         if(e>0)
        {
            System.out.println(+e+" es positivo" );
           contar = contar + 1; 
            
            
        } 
         
         //segunda
         
         if(a<0)
        {
            System.out.println(+a+" es negativo" );
            contar2 = contar2 + 1; 
           
           
        }
        if(b<0)
        {
            System.out.println(+b+" es negativo" );
           contar2 = contar2 + 1; 
         
            
        }
        if(c<0)
        {
            System.out.println(+c+" es negativo" );
           contar2 = contar2 + 1; 
            
            
        } 
         if(d<0)
        {
            System.out.println(+d+" es negativo" );
           contar2 = contar2+ 1; 
            
            
        } 
         if(e<0)
        {
            System.out.println(+e+" es negativo" );
           contar2 = contar2 + 1; 
            
            
        } 
         //tercera
         
        if(a==0)
        {
            System.out.println(+a+" es neutro" );
            contar3 = contar3 + 1; 
           
           
        }
        if(b==0)
        {
            System.out.println(+b+" es neutro" );
            contar3 = contar3 + 1; 
            
           
        }
        if(c==0)
        {
            System.out.println(+c+" es neutro" );
            contar3 = contar3 + 1; 
           
           
        } 
        if(d==0)
        {
            System.out.println(+d+" es neutro" );
            contar3 = contar3 + 1; 
           
            
        } 
        if(e==0)
        {
            System.out.println(+e+" es neutro" );
            contar3 = contar3 + 1; 
           
            
        } 
        System.out.println("lleva (" +contar+ ") positivo(s); ("+contar2+") negativo(s); y ("+contar3+") neutro(s) ");
    }
    
}
