 Slip19 Q.1. Core Java: A) Write a Java program to display
 Fibonacci series using function. [15 M]


import java.io.*;
 class slip19
 {
 public static void main(String ar[])
 {
 int n=10 , ft=0, st=1;
 System.out.println("fibonacci series  are" +n+ "terms:");
 for(int i=1;i<=n;++i)
 {
 System.out.print(ft+",");
 int nt=ft+st;
 ft=st;
 st=nt;
 }
 }
 }
