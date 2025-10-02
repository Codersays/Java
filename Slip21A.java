 Slip21 Q.1. Core Java: A) Write a java program to display each
 word from a file in reverse order. [15 M]


 import java.io.*;
 class slip21
 {
public static void main(String arg[])throws IOException
 {
 FileReader fr=new FileReader("input.txt");
 FileWriter fw=new FileWriter("output.txt");
 BufferedReader b=new BufferedReader(fr);
 String data;
 String reverse;
 while((data=b.readLine())!=null)
 {
 String words[]=data.split(" ");
 for(String a:words)
 {
 StringBuilder builder=new StringBuilder(a);
 System.out.println(builder.reverse().toString());
 }
 }
 }
 }
