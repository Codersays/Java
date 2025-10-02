 SLIP 12.A) Write a java program to display each String in reverse
 order from a String array

 import java.io.*;
 class Slip12A{
 public static void main(String args[]){
 String arr[] = {"swarup", "Sayali", "Mahesh"};
 for(int i=arr.length-1; i>=0; i--){
 System.out.print(arr[i] + ' ');
 }
 }
 }
