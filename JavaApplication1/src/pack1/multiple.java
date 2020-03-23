/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class multiple {
      public static void main (String[] args){
       int i;
       int [] a=new int[50];
       int m=9;  
       //Scanner inp=new Scanner(System.in);
       
      for(i=0;i<a.length;i++){
          a[i]=m;
        System.out.println("Multiple of 9:"+a[i]);
          m=m+9;    
      }
     
   
   }
    
    
}
