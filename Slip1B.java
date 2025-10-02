 Slip 1 .B)Write a ‘java’ program to copy only non-numeric data from one file to another file.

  import java.io.*;
  public class Slip1q2
 {
   public static void main(String[] args) throws IOException
 {
   System.out.println("reading file...");
   FileReader fileReader = new
   FileReader("Slip1/src/sourcefile1q2.txt");
   FileWriter fileWriter = new
   FileWriter("Slip1/src/destinationfile1Q2.txt");
   int data = fileReader.read();
   System.out.println("writing file...");
   while (data != -1){
   String content = String.valueOf((char)data);
   if(Character.isAlphabetic(data)) {
   fileWriter.append(content);
 } 
   else if(content.equals(" "))
{
   fileWriter.append(" ");
  }
   data = fileReader.read();
 }
  System.out.println("\nCOPY FINISHED SUCCESSFULLY...");
  fileWriter.close();
  fileReader.close();
  }
}
 
