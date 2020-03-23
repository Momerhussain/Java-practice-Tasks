/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
       public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        Scanner inp=new Scanner(System.in);
        int a[]=new int[5];
        int i,b;
        a1.add("good");
        a1.add("Student");
        a1.add("hello");
        a1.add("data structure");
        System.out.println("Array "+a1); 
        a1.add(0,"omer");
        System.out.println("Array add"+a1); 
        a1.remove("omer");
        System.out.println("Array remove:"+a1); 
        System.out.println("Array size:"+a1.size()); 
        System.out.println("Array set:"+a1.set(2,"Ali")); 
        System.out.println("Array index:"+a1.indexOf("Student")); 
        System.out.println("Array contain:"+a1.contains("good")); 
        System.out.println("Array set:"+a1.set(2,"Ali"));   } }
