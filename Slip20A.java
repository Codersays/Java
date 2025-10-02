 SLIP 20.A) Write a java program using AWT to create a Frame
 with title “TYBBACA”, background color RED. If user clicks on
 close button then frame should close.


 import javax.swing.*;
 import java.awt.*;
 class Slip20A {
 public static void main(String args[]) {
JFrame frame = new JFrame("TYBBACA");
 frame.setSize(400, 400);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.getContentPane().setBackground(Color.RED);
 frame.setVisible(true);
 }
 }
