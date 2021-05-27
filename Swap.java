import java.util.*;
public class Swap
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,temp;
System.out.println("Enter the value of a,b AND c");
a=in.nextInt();
b=in.nextInt();
System.out.println("Before swap the value of A="+a+"The value of B="+b);
temp=a;
a=b;
b=temp;
System.out.println("After swap the value of A="+a+"The value of B="+b);
}
}