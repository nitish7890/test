public class EmpwageBuilderMultiCompany{
  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
  public static int computeEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
  int empHrs=0;
  int totalEmpHrs=0;
  int totalWorkingDays=0;
  while(totalEmpHrs<=maxHoursPerMonths && totalWorkingDays<numOfWorkingDays)
   {
     totalWorkingDays++;
  int empcheck=(int)Math.floor(Math.random()*10)%3;
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
   totalEmpHrs+=empHrs;
   System.out.println("Days" +totalWorkingDays+"EmpHrs"+empHrs);
  }
  int totalEmpWage=totalEmpHrs*empRatePerHours;
  System.out.println("total emp wage" +totalEmpWage);
  return totalEmpWage;
  }
 public static void main(String args[]){
   computeEmpwage("Dmart", 20,2,10);
   computeEmpWage("Reliance", 10,4,20);
}
}
 