package pack1;
import java.util.Scanner;
public class linkinsertfirst {
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
        node newnode=new node(11);
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
       newnode.next=ptr;
       ptr=newnode;
       System.out.println("After insert");
       while(ptr!=null)
       {
          
         System.out.println(ptr.num+" "+ptr.next);
           ptr=ptr.next; 
       }
        
    }
}

