/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i,x;
        int a[]=new int[5];
        System.out.println("Enter elements");
        for(i=0;i<5;i++){
            a[i]=inp.nextInt();
          }
       System.out.println("Search Element");
       x=inp.nextInt();  
       for(i=0;i<5;i++){
           if(a[i]==x){
           System.out.println("Found Element :"+x+"at index :"+(i+1));        
           break;
           }
       }
           if(i==5){       
               System.out.println("Not found");
   }}}