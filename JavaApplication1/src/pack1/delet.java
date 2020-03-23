/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.Scanner;
public class delet {
    
public static void main (String[] args){
    int a[]=new int[5];
    int size,i,pos,j;
    Scanner inp=new Scanner(System.in);
    for(i=0;i<5;i++){
        a[i]=inp.nextInt();
    }
    System.out.println ("Enter positiomn"); 
    pos=inp.nextInt();
    for(i=0;i<5-1;i++){
        if(a[i]==pos);
        {
            for(j=pos-1;j<5-1;j++){
            a[j]=a[j+1];
            }    
            
            }
    }
      for(i=0; i<(5-1); i++)
           {
               System.out.print(a[i]+ " ");
           }
}

}
