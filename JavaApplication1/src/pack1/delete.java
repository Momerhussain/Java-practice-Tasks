/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;


public class delete {
    public static void main(String[] args) {
        int a[]= new int [7];
        Scanner inp=new Scanner(System.in);  
        int j,k; 
        for(j=1;j<6;j++){
         a[j]=inp.nextInt();
       }
       System.out.println ("Enter position u want to delete");
       k=inp.nextInt();
       for(j=k;j<6;j++){
           a[j]=a[j+1];
       }
       System.out.println ("After delete");
       for(j=1;j<6-1;j++){
             System.out.println (a[j]);
       }      }}
