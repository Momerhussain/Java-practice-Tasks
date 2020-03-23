/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;


public class insertionsortINT {
        public static void main(String[] args)
    {   String a[]={"if","gh","ef","cd","ab"};
        String temp=new String();
        int ptr,k;
        for(k=2;k<a.length;k++){
             temp=a[k];
             ptr=k-1;
             while(temp.compareToIgnoreCase(a[ptr])<0){
                a[ptr+1]=a[ptr];
                ptr=ptr-1; }
        a[ptr+1]=temp; }
        System.out.println(Arrays.toString(a)); }}
