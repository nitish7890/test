public class EmpwageBuilderUC2
{
     public static int IS_FULL_TIME=1;
     public static int EMP_RATE_PER_HOUR=20;
     public static int empHrs=0;
     public static int empWage=0;
 public static void computeEmpwage(){
  duoble empcheck=Math.floor(Math.random()*10)%2;
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

 public static void main(String args[])
  {
    computeEmpwage();
  }
