/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Arrays;
public class matrixmult {
  public static void main(String[] args) {
     int a[][]={{1,2},{3,4}};
     int b[][]={{5,6},{7,8}};
     int c[][]=new int[a.length][b.length];
     int i,j,k;
     for(i=0;i<a.length;i++){
         for(j=0;j<b.length;j++){
             for(k=0;k<c.length;k++){
             c[i][j]=c[i][j]+a[i][k]*b[j][k];
             }} }
      System.out.println("After Multiplication"+Arrays.deepToString(c));    }}
