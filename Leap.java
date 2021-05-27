import java.util.*;
class Leap
{
    public static void main(String args[])
    {
       int year;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the value of year");
       year=in.nextInt();
      if((((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0)))
       {
   System.out.println("yearis a leap year");
        }
    else
      {
   System.out.println("year is not a leap year");
     }
 }
}