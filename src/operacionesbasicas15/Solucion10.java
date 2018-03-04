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
public class Solucion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner MayorMenor = new Scanner(System.in);
      
      int Valor1;
      int Valor2;
      
        System.out.println("Ingrese primer valor");
        Valor1=MayorMenor.nextInt();
         System.out.println("Ingrese segundo valor");
        Valor2=MayorMenor.nextInt();
        
        if(Valor1<Valor2)
        { 
            System.out.println(+Valor2+" Es mayor que "+Valor1);
        }
        else if(Valor1>Valor2)
        { 
            System.out.println(+Valor1+" Es mayor que "+Valor2);
        }
         else if(Valor1==Valor2)
        { 
            System.out.println("Los valores son iguales");
        }
        
        
        
        
    }
    
} 
