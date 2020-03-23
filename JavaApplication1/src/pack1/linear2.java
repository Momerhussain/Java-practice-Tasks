/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import java.util.Arrays;
import java.util.Scanner;
public class linear2 {
    public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int[] DATA=new int[5];
int Ptr,K,N=4,Temp;
System.out.println("Enter any 5 numbers: ");
for(int i=0;i<=N;i++)
{DATA[i]=input.nextInt();}
for(K=0;K<N;K++)
{
    Ptr=1+K;
while(Ptr<=N)
{
if(DATA[K]<DATA[Ptr])
{
Temp=DATA[K];
DATA[K]=DATA[Ptr];
DATA[Ptr]=Temp;
}
Ptr++;
}
}
System.out.println("After Sorting: ");
System.out.println(Arrays.toString(DATA));}}