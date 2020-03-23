/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;


public class insertlast {
           static class node{
     int num;
     node next;
     node(int n)
     {
         num = n;
         next=null;
      }
    }
  
    public static void main(String[] args) {
        node newnode=new node(12);
        node node1 = new node(22);
        node node2 = new node(23);
        node node3 = new node(24);
        node1.next= node2;
        node2.next= node3;
        node3.next= null;
        node ptr;
        ptr = node1; 
        System.out.println("Before Insert");
        while(ptr!=null)
       {
          
         System.out.println(ptr.num+" "+ptr.next);
           ptr=ptr.next; 
       }
       ptr = node1;
       node3.next=newnode;
       newnode.next=null;
       System.out.println("After insert");
       while(ptr!=null)
       {
          
         System.out.println(ptr.num+" "+ptr.next);
           ptr=ptr.next; 
       }
        
    } 
}
