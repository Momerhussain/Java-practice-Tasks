/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class quad {
  
       public static void main (String[] args){
       double a,b,c,q;
      Scanner inp=new Scanner(System.in);
      System.out.println ("enter a,b,c values");
      a=inp.nextDouble();
      b=inp.nextDouble();
      c=inp.nextDouble();
      q=((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
      System.out.println ("Quadratic equation"+q);
   } 
}
