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
public class Solucion15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MayorMenor = new Scanner(System.in);
      
      int Valor1;
      int Valor2;
      int Valor3;
      int Valor4;
      
        System.out.println("Ingrese primer valor");
        Valor1=MayorMenor.nextInt();
         System.out.println("Ingrese segundo valor");
        Valor2=MayorMenor.nextInt();
        System.out.println("Ingrese tercer valor");
        Valor3=MayorMenor.nextInt();
        System.out.println("Ingrese cuarto valor");
        Valor4=MayorMenor.nextInt();
        
        //uno
       if(Valor2<Valor1)
        { 
            if(Valor1>Valor3)
            if(Valor1>Valor4)
                
            if(Valor2<Valor3)
            if(Valor2<Valor4)
            {
                 System.out.println("El mayor es "+Valor1+" el menor es "+Valor2);
            }
        }
       //dos
       if(Valor2<Valor1)
        { 
            if(Valor1>Valor3)
            if(Valor1>Valor4)
                
            if(Valor3<Valor2)
            if(Valor3<Valor4)
            {
                 System.out.println("El mayor es "+Valor1+" el menor es "+Valor3);
            }
        }
       //tres
       if(Valor2<Valor1)
        { 
            if(Valor1>Valor3)
            if(Valor1>Valor4)
                
            if(Valor4<Valor3)
            if(Valor4<Valor2)
            {
                 System.out.println("El mayor es "+Valor1+" el menor es "+Valor4);
            }
        }
       //cautro
       if(Valor1<Valor2)
        { 
            if(Valor2>Valor3)
            if(Valor2>Valor4)
                
            if(Valor1<Valor3)
            if(Valor1<Valor4)
            {
                 System.out.println("El mayor es "+Valor2+" el menor es "+Valor1);
            }
        }
       //cinco
       if(Valor1<Valor2)
        { 
            if(Valor2>Valor3)
            if(Valor2>Valor4)
                
            if(Valor3<Valor1)
            if(Valor3<Valor4)
            {
                 System.out.println("El mayor es "+Valor2+" el menor es "+Valor3);
            }
        }
       //seis
       if(Valor1<Valor2)
        { 
            if(Valor2>Valor3)
            if(Valor2>Valor4)
                
            if(Valor4<Valor1)
            if(Valor4<Valor3)
            {
                 System.out.println("El mayor es "+Valor2+" el menor es "+Valor4);
            }
        }
       //siete
       if(Valor1<Valor3)
        { 
            if(Valor3>Valor2)
            if(Valor3>Valor4)
                
            if(Valor1<Valor2)
            if(Valor1<Valor4)
            {
                 System.out.println("El mayor es "+Valor3+" el menor es "+Valor1);
            }
        }
       //ocho
       if(Valor1<Valor3)
        { 
            if(Valor3>Valor2)
            if(Valor3>Valor4)
                
            if(Valor2<Valor1)
            if(Valor2<Valor4)
            {
                 System.out.println("El mayor es "+Valor3+" el menor es "+Valor2);
            }
        }
       //nueve
       if(Valor1<Valor3)
        { 
            if(Valor3>Valor2)
            if(Valor3>Valor4)
                
            if(Valor4<Valor2)
            if(Valor4<Valor1)
            {
                 System.out.println("El mayor es "+Valor3+" el menor es "+Valor4);
            }
        }
       //diez
        if(Valor1<Valor4)
        { 
            if(Valor4>Valor2)
            if(Valor4>Valor3)
                
            if(Valor1<Valor3)
            if(Valor1<Valor2)
            {
                 System.out.println("El mayor es "+Valor4+" el menor es "+Valor1);
            }
        }
       //once
       if(Valor1<Valor4)
        { 
            if(Valor4>Valor2)
            if(Valor4>Valor3)
                
            if(Valor2<Valor3)
            if(Valor2<Valor1)
            {
                 System.out.println("El mayor es "+Valor4+" el menor es "+Valor2);
            }
        }
       //doce
       if(Valor1<Valor4)
        { 
            if(Valor4>Valor2)
            if(Valor4>Valor3)
                
            if(Valor3<Valor1)
            if(Valor3<Valor2)
            {
                 System.out.println("El mayor es "+Valor4+" el menor es "+Valor3);
            }
        }
       
    }
    
}
