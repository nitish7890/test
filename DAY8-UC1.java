public class EmpwageBuilder
{
public static int IS_FULL_TIME=1;
public static void computeEmpwage(){
  double empcheck=Math.floor(Math.random()*10)%2;
   if(empcheck==IS_FULL_TIME)
    {
    System.out.println("employee is present");
    }
   else
   {
  System.out.println("employee is absent");
   }
  }
}
public static void main(String args[])
{
 computeEmpwage();
}
 
