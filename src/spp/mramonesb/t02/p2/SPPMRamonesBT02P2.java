/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.t02.p2;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner kb= new Scanner (System.in);
    
        System.out.println("Introduzca un numero");
        
        String valsup= kb.nextLine();
        int valinf= Integer.parseInt(valsup);
         
        for (int i = 1; i <= valinf; i++){
          if (valinf % i == 0)  {
              System.out.println(i);
          }
        }
          if (valinf%3==0 & valinf%5==0){
              System.out.println("El numero si es divisible entre 3 y 5");
                 
          } else{
              System.out.println("El numero no es divisible entre 3 y 5");
          }
          
          if(valinf%2==0){
                      System.out.println("El numero es par");
                      
                      }else{
              System.out.println("El numero no es par");
            
        }
        }
            
            
                
        
    }
    

