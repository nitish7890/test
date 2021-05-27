import java.util.*;
public class Factorial
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,fact=1,n;
System.out.println("enter the value of n");
n=in.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial="+fact);
}
}
