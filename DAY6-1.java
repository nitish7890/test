import java.util.*;
public class Fibonacci
{
public static void main(String args[])
{
int a=0,b=1,c,n;
System.out.println("enter the value of n");
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.print("Fibonacci Serirs="+a+"\t"+b);
int i=3;
while(i<=n)
{
c=a+b;
System.out.print("\t"+c);
a=b;
b=c;
i++;
}
}
}
