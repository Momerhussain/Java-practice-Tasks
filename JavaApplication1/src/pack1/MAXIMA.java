/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;
public class MAXIMA {
    public static void main(String args[]){
     int max = 0,i,j,min=0;
     Scanner inp=new Scanner(System.in);
        int [] a=new int[6]; 
        System.out.println("Enter 5 numbers");
    
        for(i=0;i<a.length;i++){
            a[i]=inp.nextInt();
        }
        for(i=0;i<a.length;i++){
             if(a[i]>max){
                 max=a[i];
                           
             }
          else  if(a[i]<min){
                min=a[i];
                
                            }
             
             
            }  
        System.out.println("max:"+max+"\nmin:"+min);    
        
           
    
    }

}
