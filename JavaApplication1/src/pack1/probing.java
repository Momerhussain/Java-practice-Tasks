/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.Scanner;
import java.util.Arrays;
public class probing {
 public static void main(String[] args) {
int key[]={89,18,49,58,9,29};
int list=7;
System.out.print(" Key = ");
System.out.println(Arrays.toString(key));  
for(int i=0;i<key.length;i++)
{
key[i]=key[i]%list;
}
System.out.println(Arrays.toString(key));  
System.out.println("After Resolving Collisin With Linear Probing");
for(int i=0;i<key.length-1;i++)
{
if(key[i]==key[i+1]) 
{     key[i]=key[i+1]+1;}
else
 key[i]=key[i];
}
System.out.println(Arrays.toString(key));  
 }}


