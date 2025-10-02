Slip 6.A) Write a java program to accept a number from user, if
 it zero then throw user defined Exception “Number Is Zero”,
 otherwise calculate the sum of first and last digit of that
 number. (Use static keyword).


 import java.io.*;
 class NumZero extends Exception{}
 public class Slip6A {
 static int n;
 public static void main(String args[]){
 int first,last=0;
 DataInputStream dr = new DataInputStream(System.in);
 try {
 System.out.print("Enter Number : ");
 n = Integer.parseInt(dr.readLine());
 if(n!=0){
 last = n % 10;
 first = n;
 while(n>=10){
 n = n / 10;
 }
 first=n;
 System.out.print("Sum of First and Last Number is : " +
 (first + last));
}else{
 throw new NumZero();
 }
 } catch (NumZero nz) {
 System.out.println("Number is Zero");
 }
 catch(Exception e){}
 }
 }
