import java.util.*;
public class Geometry
{
   public static int x1,x2,y1,y2;
   public static double lenght;
 public static void computeGeometry()
 {
  Scanner in=new Scanner(System.in);
  System.out.println("enter the value of cordinate axies");
   x1=in.nextInt();
   x2=in.nextInt();
   y1=in.nextInt();
   y2=in.nextInt();
  lenght=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("length of the line=" +lenght);
  }
}
public static void main(String args[]){
    computeGeometry();
}