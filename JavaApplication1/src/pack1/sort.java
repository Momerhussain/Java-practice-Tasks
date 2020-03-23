/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
import java.util.Scanner; 
public class sort {
   public static void main(String args[]){
       Scanner inp= new Scanner(System.in);
       int a[]=new int [10];
       int i,j,b;
       int temp;
      
       System.out.println("Enter 10 integers");
       for(i=0;i<10;i++)
       {
           a[i]=inp.nextInt();
       }
       for(i=0;i<10;i++)
       {
          for(j=0;j<10;j++){
            if(a[i]<a[j])      
            {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
            }
         } 
       }
          for(i=0;i<10;i++){
           System.out.println("After sorting"+a[i]);
       }
   }
 }
