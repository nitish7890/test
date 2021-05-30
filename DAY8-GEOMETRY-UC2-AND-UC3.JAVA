import java.util.*;
public class Geometry2
{
 
  Scanner in=new Scanner(System.in);
   int x1,x2,y1,y2,x3,x4,y3,y4;
   double lenght1,lenght2;
  System.out.println("enter the value of cordinate axies");
   x1=in.nextInt();
   x2=in.nextInt();
   y1=in.nextInt();
   y2=in.nextInt();
   x3=in.nextInt();
   x4=in.nextInt();
   y3=in.nextInt();
   y4=in.nextInt();
void get()
{
  lenght1=Math.sqrt((x2-x1)^2+(y2-y1)^2);
System.out.println("length of the line1=" +lenght1);
  lenght2=Math.sqrt((x4-x3)^2+(y4-y3)^2);
System.out.println("length of the line2=" +lenght2);
}
void put()
{
if(lenght1==lenght2)
 {
 System.out.println("TWO LINES ARE EQUAL");
 } 
else if(lenght1>=lenght2)
 {
 System.out.println("LINES 1 ARE GREATER");
 }
 else
 {
 System.out.println("LINES 2 ARE GREATER");
 }

  }

class Geometryuc2AndUc3
{
public static void main(String args[])
  {
 Geometryuc2AndUc3 ob=new Geometryuc2AndUc3;
  ob.get();
  ob.put();
}
}