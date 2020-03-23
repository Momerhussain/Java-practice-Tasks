/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
import java.util.Scanner;
public class merge {
       public static void main(String[] args) {
        int i,j;
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int c[]=new int [a.length+b.length];
        Scanner inp=new Scanner(System.in);
        System.out.println("1st Array: "+Arrays.toString(a));          
        System.out.println("2st Array: "+Arrays.toString(b));            
        System.out.println("After merge: ");          
        for(i=0;i<a.length;i++){
          c[i]=a[i];
        }
        for(j=0;j<b.length;j++){
           c[i++]=b[j];        }
        System.out.println("Merge Array: "+Arrays.toString(c));  }}
