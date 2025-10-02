 Slip 21 B) Create a hash table containing city name & STD code.
 Display the details of the hash table. Also search for a specific
 city and display STD code of that city.


 import java.util.*;
 import java.io.*;
 public class Slip21B {
 public static void main(String args[]){
 Hashtable h1=new Hashtable<>();
 Enumeration en;
int i,n,std,val,max=0;
 String nm, cname, str, s=null;
 DataInputStream dr = new DataInputStream(System.in);
 try {
 System.out.print("Enter the Now Many Record You Want : ");
 n = Integer.parseInt(dr.readLine());
 System.out.print("Enter the City Name & STD Code : ");
 for(i=0; i<n; i++){
 cname = dr.readLine();
 std = Integer.parseInt(dr.readLine());
 h1.put(cname,std);
 }
 System.out.print("Enter city name to search : ");
 nm = dr.readLine();
 en=h1.keys();
 while(en.hasMoreElements()){
 str=(String)en.nextElement();
 val=(Integer)h1.get(str);
 if(str.equals(nm)){
 System.out.print("STD Code : " + val);
 }
 }
 } catch (Exception e) {}
}
 }
