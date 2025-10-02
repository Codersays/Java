Slip 13.B) Write a java program that asks the user name, and
 then greets the user by name. Before outputting the user's
 name, convert it to upper case letters. For example, if the user's
 name is Raj, then the program should respond "Hello, RAJ, nice
 to meet you!".


 import java.io.DataInputStream;
 class Slip13B {
 public static void main(String args[]){
 String str;
 DataInputStream dr = new DataInputStream(System.in);
 try {
 System.out.print("Enter Username : ");
 str = dr.readLine();
 System.out.print("\"Hello, " + str.toUpperCase() + ", nice
 to meet you!\"");
 } catch (Exception e) {}
 }
 }
