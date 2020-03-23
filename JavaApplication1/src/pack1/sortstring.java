/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
public class sortstring {
    public static void main(String args[]){
        String a[]={"cat","alpha","dog","baba"};
        int i,j;
        String temp=null;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-i-1;j++){
             if(a[j].compareTo(a[j+1])>0){
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
            }}   }
        System.out.println(Arrays.toString(a));}}
