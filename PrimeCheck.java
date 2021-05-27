import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int num,flag=0;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter any number:");
        num=in.nextInt();
	for(int i=2;i<=num/2;i++)
	{
	   if(num%i==0)
	   {
	      flag=1;
	      break;
	   }
	}
	if(flag==0)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}