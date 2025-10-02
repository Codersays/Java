 Slip 11.A) Write a menu driven java program using command
 line arguments for thefollowing:


 1. Addition
 2. Subtraction
 3. Multiplication
 4. Division.import java.util.Scanner;
 import java.io.*;
 import java.util.*;
 public class calculator {
 public static void main(String[] args){
 int num1=0,num2=0,option,ex=0;
 Scanner sc = new Scanner(System.in);
 do{
 System.out.println("Enter your choice from the following
 menu:");
 System.out.println("1.Addition \n2.Subtraction
 \n3.Multiplication \n4.Division \n5.Exit");
 option = sc.nextInt();
 if(option>4 || option<0){
 if (option==5){
System.out.println("You want to Exit.");
 }else
 System.out.println("Invalid choice");
 }
 else{
 System.out.print("Enter the first number : ");
 num1=sc.nextInt();
 System.out.print("Enter the second number : ");
 num2=sc.nextInt();
 }
 switch(option){
 case 1:System.out.println("Addition of "+num1+" and
 "+num2+" is "+(num1+num2));
 break;
 case 2:System.out.println("Subtraction of "+num1+"
 and "+num2+" is "+(num1-num2));
 break;
 case 3:System.out.println("Multiplication of "+num1+"
 and "+num2+" is "+(num1*num2));
 break;
 case 4: if(num2==0)
 System.out.println("Error!!! In Division denominator
 cannot be 0!");
 else{
System.out.println("In division of "+num1+" by
 "+num2+" is "+(num1/num2)+" and remainder is
 "+(num1%num2));
 }
 break;
 case 5: break;
 }
 if(option==5){
 break;
 }else{
 System.out.println("Do you want to continue? \n1.Yes
 \n2.No");
 ex=sc.nextInt();
 }
 }while(ex==1);
 sc.close();
 }
 }
