package com.bridgelabz.usecase6;

public class EmpWageUc6 {

    final int IS_FULL_TIME=2;
    final int IS_PART_TIME=1;
    final int MAX_HRS_IN_MONTH=100;
    final int EMP_RATE_PER_HOUR=20;
    final int NUM_WORKING_DAYS=20;
    int totalEmpHour=0;
    int totalWorkingDays=0;
    float totalSalary=0.0f;

   public float getTotalSalary()
   {
       int emphr;
       while(totalEmpHour < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS )
       {
               totalWorkingDays++;
               double empCheck = Math.floor(Math.random() * 10) % 3;

           switch((int) empCheck)
           {
               case IS_FULL_TIME: emphr=8;
                   break;
               case IS_PART_TIME: emphr=4;
                   break;
               default: emphr=0;
                   break;
           }
          totalEmpHour=(totalEmpHour+emphr);

       }
           System.out.println("Total Working Hours of Month: "+totalEmpHour);
           totalSalary=(totalEmpHour*EMP_RATE_PER_HOUR);
           return totalSalary;
       }

    public static void main(String[] args) {
        EmpWageUc6 uc6EmpWage=new EmpWageUc6();
      float totalMonthSalary= uc6EmpWage.getTotalSalary();
        System.out.println("Employee Total Monthly Working Hours Salary: "+totalMonthSalary);
    }
   }



