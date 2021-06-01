import java.util.*;
class BinToDec
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int N;
int A[]=new int[20];
System.out.println("Enter the Binary number");
N=in.nextInt();
int i=0;
while(N>0)
{
A[i]=N%8;
N=N/8;
i++;
}
System.out.print("Decimal Equivalent=");
for(i=i-1;i>=0;i--)
{
System.out.print(A[i]);
}
}
}