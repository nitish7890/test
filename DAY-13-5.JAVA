import java.util.*;
public class LargestNumber2{
    public static void main(String args[]){
      Double a=70;
      Double b=40;
      Double c=60;
       Double max=a;
      if(b.compareTo(max)>0)
       {
         max=b;
       }
       if(c.compareTo(max)>0)
       {
         max=c;
       }
      

       
   System.out.println(max);
       
   }
}
