/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;
public class traverse {
    public static void main (String[] args){
              int a[]=new int [5];
       int i,sum=0;
       Scanner inp=new Scanner(System.in);
       for(i=0;i<5;i++){
       a[i]=inp.nextInt();}
       for(i=0;i<5;i++){
          sum=sum+a[i]; } 
        System.out.println("Sum is"+sum);}}
