slip24  Q.1. Core Java: A) Write a java program to count number
 of digits, spaces and characters from a file. [15 M].


 import java.io.*;
 class slip24
 {
 public static void main(String arg[])throws Exception
 {
 int cnt=0,lcnt=1,wnt=0,c;
 FileInputStream fin=new FileInputStream("abc.txt");
 while((c=fin.read())!=-1)
 {
 cnt++;
 if(c==32||c==13)
 wnt++;
 if(c==1)
 lcnt++;
 }
 System.out.println("number of character are"+cnt);
 System.out.println("number of words are"+lcnt);
 System.out.println("number of lines  are"+wnt);
 }
 }
abc.txt
 Facts about the History of India
 India is the largest and the oldest civilisation in the world.
 India holds the record of not invading any other country in the
 last 10,000 years of her history.
 Interestingly, India was one of the richest countries on earth
 before the British invaded it in the early 17th century, and was
 also one of the first countries in the ..
