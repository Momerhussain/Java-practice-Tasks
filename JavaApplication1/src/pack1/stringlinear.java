/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
public class stringlinear {
     public static void main(String args[]){
        String a[]={"cow","abcd","dog","bad"};
        int i,j;
        String temp=null;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>0){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;}}}
        System.out.println(Arrays.toString(a));}}
