SLIP 18.B) Write a java program to copy the data from one file
 into another file, while copying change the case of characters in
 target file and replaces all digits by ‘*’ symbol.


 import java.io.*;
 class slip18b
 {
 public static void main(String args[])throws IOException
 {
 int c;
 try
 {
 FileReader fr=new FileReader("a.txt");
 FileWriter fw=new FileWriter("b.txt");
 while((c=fr.read())!=-1)
 {
 if(c>=65&&c<=90)
 {
 c=c+32;
 fw.write(c);
 }
else if(c>=97&&c<=122)
 {
 c=c-32;
 fw.write(c);
 }
 else if(c>=48&&c<=57)
 {
 fw.write('*');
 }
 else
 {
 fw.write(c);
 }
 }
 System.out.println("Copy Successfully");
 fr.close();
 fw.close();
 }catch(Exception e)
 {
 System.out.println(e);
 }
 }
}
