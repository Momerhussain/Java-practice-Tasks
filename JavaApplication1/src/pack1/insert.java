
package pack1;

import java.util.Scanner;
public class insert {
    public static void main(String[] args) {
     int a[]= new int [7];
     int j,k,e;
     Scanner inp=new Scanner(System.in);   
     for(j=1;j<6;j++){
         a[j]=inp.nextInt();
       }
     System.out.println ("Enter position where u want to insert");
     k=inp.nextInt();
     for(j=6-1;j>=k;j--){
         a[j+1]=a[j];
     }
     System.out.println ("Enter element u want to insert");
     e=inp.nextInt();
     a[k]=e;
     for(j=1;j<6+1;j++){
            System.out.println ("Array Element"+a[j]);
     }  }}


