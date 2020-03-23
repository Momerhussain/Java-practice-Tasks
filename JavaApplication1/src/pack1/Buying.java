/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class Buying implements OnlinePayment {
   @Override
   public void Payment(){
        System.out.println("Inside Buying::payment() method."); 
    }  
}
