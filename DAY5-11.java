import java.util.*;
public class TwoDimArray
{
   public static void main(String[] args)
   {
      int m,n;
      Scanner in=new Scanner(System.in);
     
      System.out.println("Enter the value of row and col");
      m=in.nextInt();
      n=in.nextInt();
      int a[][]=new int[m][n];
      System.out.println("Enter the Element in array list A");
      for (int row = 0; row < m; row++)
      {
         for (int col = 0; col < n; col++)
         {
           a[m][n]=in.nextInt();
         }

           
      }
      System.out.println("Resultant of the matrix of A");
      for (int row = 0; row < m; row++)
      {
         for (int col = 0; col < n; col++)
         {
           System.out.print(a[m][n]+" ");
         }
      
       }
     System.out.println();
   }
}