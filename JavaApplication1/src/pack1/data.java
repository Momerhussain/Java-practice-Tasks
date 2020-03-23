/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;
public class data {
    public static void main(String args[]){
        String n;
        int roll,fees;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Name:");
        n=inp.nextLine();
        System.out.println("Enter Roll No:");
        roll=inp.nextInt();
        System.out.println("Enter Fees:");
        fees=inp.nextInt();
        System.out.println("Name:"+n+"\nRoll no:"+roll+"\nFees:"+fees);
       }
}
