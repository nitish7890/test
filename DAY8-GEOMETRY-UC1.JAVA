import java.util.*;
public class Geometry
{
   int x1,x2,y1,y2;
void get()
{
  Scanner in=new Scanner(System.in);
  
   double lenght;
  System.out.println("enter the value of cordinate axies");
   x1=in.nextInt();
   x2=in.nextInt();
   y1=in.nextInt();
   y2=in.nextInt();
  lenght=Math.sqrt((x2-x1)^2+(y2-y1)^2);
}
void put()
{

System.out.println("length of the line=" +lenght);
  }
}
class Uc1
{ 
public static void main(String args[]) I
Geometry ob=new Geometry();
on.get();
ob.put();
}
}