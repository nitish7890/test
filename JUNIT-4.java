public class MonthlyPayment
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int p,y,R,n;
System.out.println("Enter the value of P,Y and R");
p=in.nextInt();
y=in.nextInt();
R=in.nextInt();
n=12*y;
r=(R/(12*100));
System.out.println("The value of N="+n+"\t The value of R="+r);
double payment=p*r/1-(1+r)^(-n);
System.out.println("Payment="+payment);
}
}