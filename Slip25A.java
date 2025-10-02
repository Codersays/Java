 Slip25 Q.1. Core Java: A) Write a java program to check whether
 given string is palindrome or not. [15 M]


 import java.io.*;
 class slip25
 {
 public static void main(String ar[])throws IOException
 {
 BufferedReader br=new BufferedReader(new
 InputStreamReader(System.in));
 System.out.println("enter the string ");
 String str=br.readLine();
 String temp=str;
 StringBuffer sb=new StringBuffer(str);
 sb.reverse();
 str=sb.toString();
 if(temp.equalsIgnoreCase(str))
 System.out.println("the string is palindrome");
 else
System.out.println("the string is not palindrome");
 }
 }
