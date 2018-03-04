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
public class Solucion12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MayorMenor = new Scanner(System.in);
      
      int Valor1;
      int Valor2;
      int Valor3;
      
        System.out.println("Ingrese primer valor");
        Valor1=MayorMenor.nextInt();
         System.out.println("Ingrese segundo valor");
        Valor2=MayorMenor.nextInt();
        System.out.println("Ingrese tercer valor");
        Valor3=MayorMenor.nextInt();
        
        if(Valor1<Valor2)
        { 
            
            if(Valor2>Valor3)
            
                 
            
            if(Valor1>Valor3)
            {
                 System.out.println("El mayor es "+Valor2+" el menor es "+Valor3);
            }
        }
            //segundo
            if(Valor2<Valor1)
        { 
            
            if(Valor1>Valor3)
            
                 
            
            if(Valor2>Valor3)
            {
                 System.out.println("El mayor es "+Valor1+" el menor es "+Valor3);
            }
        }
            //tercero
            if(Valor1<Valor3)
        { 
            
            if(Valor2<Valor3)
            
                 
            
            if(Valor1<Valor2)
            {
                 System.out.println("El mayor es "+Valor3+" el menor es "+Valor1);
            }
        }
            //cuarto
            if(Valor1<Valor3)
        { 
            
            if(Valor2<Valor3)
            
                 
            
            if(Valor2<Valor1)
            {
                 System.out.println("El mayor es "+Valor3+" el menor es "+Valor2);
            }
        }
        //quinto
        
         if(Valor2<Valor1)
        { 
            
            if(Valor1>Valor3)
            
            if(Valor2<Valor3)
            {
                 System.out.println("El mayor es "+Valor1+" el menor es "+Valor2);
            }
        }
        
                
        //sexto
        
        if(Valor1<Valor2)
        { 
            
            if(Valor2>Valor3)
            
                 
            
            if(Valor1<Valor3)
            {
                 System.out.println("El mayor es "+Valor2+" el menor es "+Valor1);
            }
        }
        
        
    }}
    
    

