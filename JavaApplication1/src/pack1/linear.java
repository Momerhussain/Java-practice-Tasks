/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class linear {
     public static void main(String[] args) {
       int i,j,temp=0;
       int a[]={5,4,3,2,1};
       for(i=0;i<5;i++){
           for(j=1+i;j<=5;j++){
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
           
            for(i=0;i<5;i++){
          System.out.println("sor"+a[i]);     
      }
      
       }
     }
}
