/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.Hashtable;
public class hashbuiltin {
   public static void main(String[] args) {
      Hashtable<Integer,String>hashtable=new Hashtable(); 
      hashtable.put(1,"omer");
      hashtable.put(2,"Asad");
      hashtable.put(3,"Talha");
      hashtable.put(4,"hello");
      System.out.println("Hashing Builtin ");
      System.out.println("Removing:"+hashtable.remove(2));
      System.out.println("Containing:"+hashtable.contains("hello"));
      System.out.println("Geting:"+hashtable.get(1));
   }
}
