import java.util.*;
public class EvenOdd
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("enter the value of n");
n=in.nextInt();
if(n%2==0)
{
System.out.println("EVEN NUMBER="+n);
}
else
{
System.out.println("ODD NUMBER="+n);
}
}
}
