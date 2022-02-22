package com.bridgelabz.usecase5;

public class CalEmpWageForMonthUc5 {
    final int IS_FULL_TIME=2;
    final int IS_PART_TIME=1;
    final float EMP_RATE_PER_HOUR=20;
    final int NO_OF_WORKING_DAYS=20;
    float totalSalary=0.0f;

    public float getEmpSal()
    {
        int emphr;
        float salary=0.0f;
        for(int i=1;i<=NO_OF_WORKING_DAYS;i++)
        {
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch((int) empCheck)
            {
                case IS_FULL_TIME: System.out.println("Employee is Full Time");
                                   emphr=8;
                                   break;
                case IS_PART_TIME: System.out.println("Employee is Part Time");
                                   emphr=4;
                                   break;
                default: System.out.println("Employee is Abscent");
                                   emphr=0;
                                   break;
            }
            salary=(EMP_RATE_PER_HOUR * emphr );
            totalSalary=(totalSalary + salary);
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        CalEmpWageForMonthUc5 calEmpWageForMonth=new CalEmpWageForMonthUc5();
        float monthlySalary=calEmpWageForMonth.getEmpSal();
        System.out.println("Employee Monthly Salary : "+monthlySalary);
    }
}
