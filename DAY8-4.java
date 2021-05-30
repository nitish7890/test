public class EmpwageBuilderUC2
{
  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
  public static final int EMP_RATE_PER_HOUR=20;
     int empHrs=0;
     int empWage=0;
void get()
{
  int empcheck=(int)Math.floor(Math.random()*10)%3;
}
void put()
{
   switch(empcheck)
    {
      case IS_PART_TIME:
        empHrs=4;
        break;
      case IS_FULL_TIME: 
        empHrs=8;
        break;
      default:
          empHrs=0;
    }
   
  empWage=empHrs*EMP_RATE_PER_HOUR;
  System.out.println("empwage" +empWage);
  }
} 
}
class Uc4
{
 public static void main(String args[])
 {
 EmpwageBuilderUc4 ob=new EmpwageBuilderUc4();
 ob.get();
 ob.put();
}
}