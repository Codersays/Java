Slip 29 A) Write a java program to check whether given candidate is
 eligible for voting or not. Handle user defined as well as system
 defined Exception.


 import java.io.*;
 class NumOutRange extends Exception{}
 class Slip29A{
 static int n;
 public static void main( String args[]){
 DataInputStream dr = new DataInputStream(System.in);
 try {
 System.out.print("Enter Age : ");
 n = Integer.parseInt(dr.readLine());
 if(n<18){
 throw new NumOutRange();
 }else{
 System.out.print("You Are eligible For Voting :) ");
 }
 } catch (NumOutRange nz) {
 System.out.println("You Are Not eligible For Voting ....!");
 }
catch (Exception e){}
 }
 }
