/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class infinixtopostfix {
       public static void main(String[] args) {
          int i;
          char operand[]=new char[10];
           String q="A+(B+C)";
          char p[]=new char[10];
          char c,j;
              for(i=0;i<p.length;i++){
              c=q.charAt(i);
            p=q.toCharArray();
          System.out.println(p[i]);
              }
     for(i=0;i<p.length;i++){
      for(j='A';j<'Z';j++){
         for(int k=0;k<operand.length;k++){
          if(p[i]==j){
          p[i]=operand[k];
         }
         }
      }   
     } 
       
      for(i=0;i<operand.length;i++){
          System.out.println(operand[i]);
      } 
       
       
       }
}
