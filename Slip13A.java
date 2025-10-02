Slip13 Q.1. Core Java: A) Write a java program to accept ‘n’
 integers from the user & store them in an ArrayList collection.
 Display the elements of ArrayList collection in reverse order. [15M]


 import java.io.*;
 import java.util.*;
 class slip13
{
 public static void main(String arg[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the limit of array list");
 int n=sc.nextInt();
 ArrayList al=new ArrayList();
 System.out.println("enter the elements of arry list");
 for(int i=0;i<n;i++)
 {
 String el=sc.next();
 al.add(el);
 }
 System.out.println("the original array list is :"+al);
 Collections.reverse(al);
 System.out.println("the original reverse array list is :"+al);
 }
 }
 Output:
 C:\Program Files\Java\jdk1.8.0_144\bin>java slip13
 enter the limit of array list
 4
enter the elements of arry list
 a b c d
 the original array list is :[a, b, c, d]
 the original reverse array list is :[d, c, b, a]
