 SLIP 19.B) Create an Applet that displays the x and y position of
 the cursor movement using Mouse and Keyboard. (Use
 appropriate listener)


imort java.io.*;
 imort java.awt.event.*;
 imort java.applet.*;
 imort java.awt.event.keyListener.*;
 public class slip9b extends Applet implements
 MouseListener,KeyListener
 {
 private int x,y;
 private String str=" ";
public void paint(Graphics g)
 {
 g.drawString(str,x,y);
 }
 public void mouseClicked(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void keyPressed(KeyEvent ke)
 {
 showStatus("key pressed");
 }
 public void keyReleased(KeyEvent ke)
 {
 showStatus("key released");
 }
 public void keyReleased(KeyEvent ke)
 {
 showStatus("key released");
 }
public void keyTyped(KeyEvent ke)
 {
 str +=ke.getKeyChar();
 repaint();
 }
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
}
 public void mouseEntered(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseExited(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="Mouse is Exited in "+"x ="+x+",y="+y+"Co-ordinates";
 repaint();
 }
 public void mousePressed(MouseEvent m)
 {
 x=m.getX();
 y=m.getY();
 str="x ="+x+",y="+y;
 repaint();
 }
 public void mouseReleased(MouseEvent m)
{
 x=m.getX();
 y=m.getY();
 str="Mouse Released at "+"x ="+x+",y="+y+"Co-ordinates";
 repaint();
 }
 }
 /*
 <applet code="slip19b.class" width="300" height="300">
 </applet>
 */
