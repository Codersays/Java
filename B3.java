 Slip 3. B)Define an abstract class Shape with abstract methods
 area () and volume (). Derive abstract class Shape into two
 classes Cone and Cylinder. Write a java Program to calculate
 area and volume of Cone and Cylinder.(Use Super Keyword.)

 import java.util.Scanner;
 public class Slip3q2 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Shape shape;
 System.out.println("""
 ENTER YOUR CHOICE
 1. Cone
 2. Cylinder""");
 int choice = scanner.nextInt();
 if (choice==1){
 System.out.println("Enter radius");
 int radius = scanner.nextInt();
 System.out.println("Enter height");
 int height = scanner.nextInt();
 shape=new Cone(radius,height);
shape.area();
 shape.volume();
 }else if (choice==2){
 System.out.println("Enter radius");
 int radius = scanner.nextInt();
 System.out.println("Enter height");
 int height = scanner.nextInt();
 shape=new Cylinder(radius,height);
 shape.area();
 shape.volume();
 }else {
 System.out.println("invalid input");
 }
 }
 abstract static class Shape{
 abstract void area();
 abstract void volume();
 }
 static class Cone extends Shape {
 int radius,height;
 Cone(int radius,int height){
this.radius=radius;
 this.height=height;
 }
 void area(){
 float slant_height=(height*height)+(radius*radius);
 float area =
 (float)(Math.PI*radius*(radius+Math.sqrt(slant_height)));
 System.out.println("Area of Cone : "+area);
 }
 void volume(){
 float volume = (float)(Math.PI*radius*radius*(height/3));
 System.out.println("Volume of cone : "+volume);
 }
 }
 static class Cylinder extends Shape {
 int radius, height;
 Cylinder(int r,int h){
 radius =r;
 height =h;
 }
 public void area(){
 float area=(float)((2*Math.PI* radius *
 height)+(2*Math.PI* radius * radius));
System.out.println("Area of Cylinder : "+area);
 }
 public void volume(){
 float volume=(float)(Math.PI* radius * radius * height);
 System.out.println("Volume of Cylinder : "+volume);
 }
 }
 }
 
