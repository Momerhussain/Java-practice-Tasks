/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;

public class favo {
    public static void main (String[] args){
   int i;
       Scanner inp=new Scanner(System.in);  
       String [] a=new String[10]; 
       System.out.println ("Enter your favourite chocolate name: ");
    for(i=0;i<10;i++)  
    {
        a[i]=inp.next();
    }
    for(i=0;i<10;i++){
    System.out.println ("Chocolate::"+a[i]);    
    }
    }    
}
