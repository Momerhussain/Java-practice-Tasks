/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
public class BNsearch {
    public static void main(String[] args) {
        int a[]={45,3,12,2,4,5};
        char b[]={'d','c','b','a'};
        float c[]={5.2f,34.3f,2.3f};
        int d[]={45,3,12,2,4,5};
        int e[]=new int[6];
        int f[]={9,8,7};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));       
        System.out.println(Arrays.binarySearch(a,45));
        Arrays.sort(b);   
        System.out.println(Arrays.toString(b));       
        System.out.println(Arrays.binarySearch(b,'c'));       
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));     
        System.out.println(Arrays.binarySearch(c,5.2f));
        System.out.println(Arrays.equals(a,d));
        int[] a2=Arrays.copyOf(f,5);
        a2[3]=8;
        a2[4]=9;
        System.out.println(Arrays.toString(a2));
        Arrays.fill(f,1);
        System.out.println(Arrays.toString(f));
        Arrays.fill(f,0,2,5);
        System.out.println(Arrays.toString(f));   }}
