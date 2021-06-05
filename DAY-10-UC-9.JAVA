public class EmpwageBuilderObject{
  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
   private final String company;
   private final int empRatePerHour;
   private final int numOfWorkingDays;
   private int totalEmpWage;
  public EmpWageBuilderObject(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){){
    this.company=company;
    this.empRatePerHour=empRatePerHour;
    this.numOfWorkingDays=numOfWorkingDays;
    this.maxHoursPerMonth=maxHourPerMonth;
   public void compute(){
    int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
  while(totalEmpHrs<=maxHourPerMonth&& totalWorkingDays<numOfWorkingDays)
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
  int totalEmpWage=totalEmpHrs*empRatePerHour;
  }
 @override
  public String toString(){
     return "TotalEmp wage for comapny:"+company+"is"+totalEmpWage;
 }
 public static void main(String args[]){
  EmpWageBuilderObject dmart=new   EmpWageBuilderObject("Dmart",20,2,10);
  EmpWageBuilderObject reliance=new EmpWageBuilderObject("Reliance",10,4,12);
  dmart.computeEmpWage();
  System.out.println(dmart);
  reliance.computeEmpWage();
 System.out.println(reliance);
   
}

