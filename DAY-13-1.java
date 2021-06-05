import java.util.*;
class Largest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,c;
System.out.println("Enter the value of a,b and c");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b && a>c)
{
  System.out.println("A is largest value="+a);
}
else if(b>c && b>a)
{
System.out.println("B is largest value="+b);
}
else
{
System.out.println("C is largest value="+c);
}
}
}