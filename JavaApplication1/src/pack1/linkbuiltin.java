/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.*;

public class linkbuiltin {
    public static void main(String[] args) {
         LinkedList<String> linkedlist = new LinkedList<String>();
       linkedlist.add("ali");
       linkedlist.add("omer");
       linkedlist.add("talha");
       linkedlist.add("saad");
       linkedlist.add("asad");
       linkedlist.add("abdullah"); 
       System.out.println("Linked List Content: " +linkedlist);
       linkedlist.addFirst("fahad");
       System.out.println("insert at first");
       System.out.println("Linked List Content: " +linkedlist);
       System.out.println("insert at last");
       linkedlist.addLast("Last");
       System.out.println("Linked List Content: " +linkedlist);
        Object firstvar = linkedlist.get(0);
       System.out.println("First name: " +firstvar);
        linkedlist.set(0, "Areeb");
       Object firstvar2 = linkedlist.get(0);
         System.out.println("First name after update by set method: " +firstvar2);
          linkedlist.removeFirst();
       linkedlist.removeLast();
       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
       linkedlist.add(0, "Nazim");
       linkedlist.remove(2);
       System.out.println("Final Content: " +linkedlist); 

    }
}

