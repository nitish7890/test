import java.util.*;
public class DigitOfSum
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = in.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}