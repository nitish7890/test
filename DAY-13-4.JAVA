import java.util.*;
public class LargestNumber{
    public static void main(String args[]){
      Integer a=50;
      Integer b=40;
      Integer c=60;
      Integer max=a;
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
