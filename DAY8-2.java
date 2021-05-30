public class EmpwageBuilderUC2
{
   int IS_FULL_TIME=1;
     int EMP_RATE_PER_HOUR=20;
     int empHrs=0;
     int empWage=0;
 void get()
  {
    
  duoble empcheck=Math.floor(Math.random()*10)%2;
  }
 void put()
 {
   if(empcheck==IS_FULL_TIME)
    {
      empHrs=8;
    }
   else
   {
      empHrs=0;
   }
  empWage=empHrs*EMP_RATE_PER_HOUR;
  System.out.println("empwage" +empWage);
  }
} 
class Uc2
{

  public static void main(String args[])
  {
   EmpwageBuilderUc2 ob=new EmpwageBuilderUc2;
    ob.get();
    ob.put();  //callig the function through the object//
  }
}
}