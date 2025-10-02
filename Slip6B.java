 Slip 6.B) Write a java program to display transpose of a given
 matrix.


 import java.util.Scanner;
 public class Transposematrix {
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter rows of matrix : ");
 int row=sc.nextInt();
 System.out.print("Enter column of matrix : ");
 int col=sc.nextInt();
int[][] matrix = new int[row][col];
 //create and insert value
 for (int i=0;i<row;i++){
 for(int j=0;j<col;j++){
 System.out.print("element at index ["+i+"]["+j+"] :");
 matrix[i][j]=sc.nextInt();
 }
 }
 sc.close();
 //print value of matrix
 System.out.println("\nReal matrix :-\n");
 for (int i=0;i<row;i++){
 for(int j=0;j<col;j++){
 System.out.print(matrix[i][j]+" ");
 }
 System.out.println();
 }
 System.out.println("\nTranspose of matrix :-\n");
 for (int i=0;i<row;i++){
 for(int j=0;j<col;j++){
 System.out.print(matrix[j][i]+" ");
 }
System.out.println();
 }
 }
 }
