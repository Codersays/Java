 Slip 25.B) Create a package named Series having three different
 classes to print series:
 i. Fibonacci series
 ii. Cube of numbers
 iii. Square of numbers
 Write a java program to generate ‘n’ terms of the above series
 NOTE: THIS QUESTION HAS TWO PROGRAMS TO BE WRITTEN AND
 COMPILED DIFFERENTLY.


 Program 1:
 package series;
 public class Prime {
 int flag;
 public void prime(int n){
 for(int i=2;i<n;i++){
 if(n%i==0)
 {
 flag=0;
 break;
 }
 else
 flag=1;
 }
 if(flag==1)
 System.out.println(n+" is a prime number.");
 else System.out.println(n+" is not a prime number.");
 }
 public void fibonacci(int n){
 int first=0, second=1, c, next;
 System.out.println("Fibonacci Series:");
 for(int i=0;i<=n;i++)
 {
 if(i<=1)
next=i;
 else
 {
 next=first+second;
 first=second;
 second=next;
 }
 System.out.println(next);
 }
 }
 public void square(int n){
 System.out.println("Square of the number is "+(n*n));
 }
 }
 Program 2:
 import series.*;
 import java.io.*;
 public class SeriesMain {
 public static void main(String [] args)throws IOException{
 Prime p=new Prime();
 int i;
BufferedReader br=new BufferedReader(new
 InputStreamReader(System.in));
 do
 {
 System.out.println("Enter a number / 0 to exit");
 i=Integer.parseInt(br.readLine());
 p.prime(i);
 p.fibonacci(i);
 p.square(i);
 }
 while(i>0);
 }
 }
