/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas15;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba2
 */ 

public class Solucion7 {

    

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
         Scanner Digito = new Scanner(System.in);
       
         int Numero;
         int Ultimo;
        System.out.println("Ingrese un numero");
        Numero = Digito.nextInt();
        Ultimo = Numero%10;
         
       
       
 System.out.println("El último dígito es: " + Ultimo);
        
        
     
       
       
        
    }
    
}
