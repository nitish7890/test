import java.util.*;
class DecToBin
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int N;
int A[]=new int[20];
System.out.println("Enter the decimal number");
N=in.nextInt();
int i=0;
while(N>0)
{
A[i]=N%2;
N=N/2;
i++;
}
System.out.print("Binary Equivalent=");
for(i=i-1;i>=0;i--)
{
System.out.print(A[i]);
}
}
}