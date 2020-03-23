/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;


class Node{
 int num; 
 String name;
 Node next;
 Node (int n, String na){
     num=n;
     name=na;
 }

}
public class linktriverse {
    public static void main(String[] args) {
        int x;
        String b;
        Node node1=new Node(22,"omer");
        Node node2=new Node(23,"ali");
        Node node3=new Node(21,"hello");
        node1.next=node2;
        node2.next=node3;
        Node ptr;
        ptr=node1;
        while(ptr!=null){
           System.out.print(" \n"+ptr.num+""+ptr.name); 
            ptr=ptr.next;
            
        }
    }
}