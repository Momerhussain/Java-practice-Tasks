/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
import java.util.Scanner;
public class bublesort {
   public static void main(String[] args) {
       int i,j,temp=0;
       int a[]=new int [5];
       Scanner inp=new Scanner(System.in);
       System.out.println("enter element:");     
       for(i=0;i<a.length;i++){
           a[i]=inp.nextInt();   }
        for(i=0;i<a.length;i++){
          for(j=0;j<a.length-i-1;j++){
              if(a[j]<a[j+1]){
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;}   } }
       for(i=0;i<a.length;i++){
          System.out.println("After sorting:"+a[i]);     }}}
