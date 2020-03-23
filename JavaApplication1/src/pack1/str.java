/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;


public class str {
   public static void main(String args[]){ 
       String c;
       String s1="sir";
       String s2="syed";
       String s3="university";
       System.out.println("Concatinate:"+s1.concat(s2).concat(s3));
       c=s1.concat(s2).concat(s3);
       System.out.println("Upper case:"+s1.toUpperCase());
       System.out.println("Sub string 4 to ownwords:"+c.substring(4,17));
       System.out.println("Sub string 2nd to 7"+c.substring(2, 7));
       System.out.println("2nd String:"+c.substring(3,7));
    
   }
   
 }
   
