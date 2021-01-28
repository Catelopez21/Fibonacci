/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int numero,a,b,i;
  
        do{
            System.out.print("Digite número entero: ");
            numero = sc.nextInt();
        }while(numero<=0);
  
        System.out.println("Los " + numero + " primeros números de la serie de Fibonacci son:");                 

        a=1;
        b=1;

        System.out.print(a + " , ");
        for(i=2; i<=numero; i++){
            System.out.print(b + " , ");
            b = a + b;
            a = b - a;
        }
        System.out.println();
    }
    
}