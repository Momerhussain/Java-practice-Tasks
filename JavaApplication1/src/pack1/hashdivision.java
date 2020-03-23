
package pack1;

import java.util.Arrays;
public class hashdivision {
     public static void main(String[] args)
    {  int i,j,list=14;
        int remainder []=new int [4]; 
        int reverse []=new int [4]; 
        int f[]=new int[4];
        int g[]=new int[4];
        int h[]=new int[4];
        int b[]=new int[4];
        int e[]=new int[4];
        int c[]=new int[4];
        int d[]=new int[4];
        int keys[]={4234,5678,4182,6858};
        System.out.println("Division method");    
        for(i=0;i<keys.length;i++){
            d[i]=keys[i]%list;
            }
        System.out.println(Arrays.toString(d));    
        System.out.println("Mid Square Method");     
        System.out.println("Keys"+Arrays.toString(keys)); 
        for(i=0;i<keys.length;i++){
            b[i]=keys[i]*keys[i];
            }
        System.out.println("Square"+Arrays.toString(b)); 
        for(i=0;i<keys.length;i++){
            c[i]=b[i]%100000;
            e[i]=c[i]/1000;          
         }
        System.out.println(Arrays.toString(e));  
        System.out.println("Folding Method without Reversing");      
        for(i=0;i<keys.length;i++){
            f[i]=keys[i]/100;
            g[i]=keys[i]%100; 
            h[i]=f[i]+g[i];
         } 
        System.out.println(Arrays.toString(h));  
        System.out.println("Folding Method  Reversing");      
        for(i=0;i<keys.length;i++){
            f[i]=keys[i]/100;
            g[i]=keys[i]%100; 
       
         while(g[i]!=0){
            remainder[i]=g[i]%10;
            reverse[i]=reverse[i]*10+ remainder[i];
            g[i]=g[i]/10;
           }
          h[i]=f[i]+reverse[i];
        
       }
       System.out.println(Arrays.toString(h)); 
    }}