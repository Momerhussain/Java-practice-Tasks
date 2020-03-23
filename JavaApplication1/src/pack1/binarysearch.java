/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
         int a[]=new int[5];
         int i,v,low,high,mid;
        System.out.println("Enter elements");
        for(i=0;i<5;i++){
            a[i]=inp.nextInt();          }
        Arrays.sort(a);
        System.out.println("Sorted array"+Arrays.toString(a));
        System.out.println("Search Element");
       v=inp.nextInt();  
       low=0;
       high=a.length-1;
       mid=low+high/2;
       while(low<=high){
              if(a[mid]<v){
               low=mid+1;          }
           else if(a[mid]==v){
               System.out.println("found value :"+v+"at Index :"+(mid+1));
           break;           }
           else{
               high=mid-1;           }
          mid=low+high/2;            }
      if(low>high){
               System.out.println("Value not found"); }    }}
