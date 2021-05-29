import java.util.*;
public class Reverse  
{  
public static void main(String[] args)   
{  
int num,n,reverse=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of n");
n=in.nextInt();
num=n; 
while(num != 0)   
{  
int remainder = num % 10;  
reverse = reverse * 10 + remainder;  
num = num/10;  
} 
System.out.println("The reverse of the given number is: " + reverse);  
}
}