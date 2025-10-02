 Slip 7.A) Write a java program to display Label with text “Dr. D Y
 Patil College”, background color Red and font size 20 on the
 frame.

 import java.awt.*;
 import java.awt.event.*;
 public class Slip7A extends Frame{
 public void paint(Graphics g){
 Font f = new Font("Georgia",Font.PLAIN,20);
 g.setFont(f);
 g.drawString("Dr D Y Patil College", 50, 70);
 setBackground(Color.RED);
 }
 public static void main(String args[]){
 Slip7A sl = new Slip7A();
 sl.setVisible(true);
 sl.setSize(200,300);
 }
}
