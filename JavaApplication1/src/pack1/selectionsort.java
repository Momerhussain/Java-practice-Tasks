/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class selectionsort {
         public static void main(String[] args) {
       int i,j,temp=0;
       int a[]={1,2,3,4,5};
        for(i=0;i<5-1;i++){
          int min=i;
            for(j=i+1;j<5;j++){
               if(a[j]>a[min]){
                   min=j;
                   temp=a[i];
                   a[i]=a[min];
                   a[min]=temp;
               }
           } 
            
            
        }
         
              for(i=0;i<5;i++){
          System.out.println("sor"+a[i]);     
      }
         
         
         }
}
