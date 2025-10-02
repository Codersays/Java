Slip4 Q.1. Core Java: A) Write a java program to display
 alternate character from a given string.[15M]


import java.io.*;
 public class slip4
 {
 public static void main( String arg[])
 {
 String s="hello world!";
 for(int i=0;i<s.length();i+=2)
 {
 System.out.println(s.charAt(i));
 }
 }
}
