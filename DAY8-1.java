import java.util.*;
public class EmpwageBuilderUc1
{
  int IS_FULL_TIME=1;
  void get()
  {
  double empcheck=Math.floor(Math.random()*10)%2;
  }
  void put(){
      
     
     double empcheck;
   if(empcheck==IS_FULL_TIME)
    {
    System.out.println("employee is present");
    }
   else
   {
  System.out.println("employee is absent");
   }
  }
class Uc1
{
public static void main(String args[])
{
System.out.println("creating the object");
EmpwageBuilderUc1 ob=new EmpwageBuilderUc1();
ob.get();
ob.put();
}
}
}
