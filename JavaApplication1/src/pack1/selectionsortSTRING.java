/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
public class selectionsortSTRING {
    public static void main(String[] args)
    {   int i ,j,min;
        String temp=new String();
        String a[]={"if","gh","ef","cd","ab"};
        for(i=0;i<a.length-1;i++){
           min=i;
           for(j=i+1;j<a.length;j++){
               if(a[j].charAt(0)<a[min].charAt(0)){
                  min=j;
                   temp=a[i];
                   a[i]=a[min];
                   a[min]=temp; }}}
        System.out.println(Arrays.toString(a));    } }
