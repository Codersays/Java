 Slip 5.A) Write a java program to display following pattern:


 5
 4 5
 3 4 5
2 3 4 5
 1 2 3 4 5
 import java.io.*;
 public class pattern {
 public static void main(String[] args) {
 int n=5;
 for (int i=n;i>0;i--){
 for (int j=i;j<=n;j++){
 System.out.print(j+" ");
 }
 System.out.println();
 }
 }
 }
