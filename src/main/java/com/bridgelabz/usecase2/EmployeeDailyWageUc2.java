package com.bridgelabz.usecase2;



public class EmployeeDailyWageUc2 {
    final int IS_FULL_TIME=1;
    final  float EMP_RATE_PER_HOUR=20;
    float salary=0;


    public int checkEmployee() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee  is Present.");
            return 1;
        }
        else {
            System.out.println("Employee is Abscent");
        }

        return 0;
    }
    public float empDailyWage()
    {
        if(IS_FULL_TIME==checkEmployee())
        {
            int emphrs=8;
            salary=(EMP_RATE_PER_HOUR*emphrs);
            return salary;
        }
        else
            salary=0;
        return salary;
    }


    public static void main(String[] args) {
        EmployeeDailyWageUc2 employeeDailyWage=new EmployeeDailyWageUc2();
       float Salary=employeeDailyWage.empDailyWage();
        System.out.println("Employee Salary: "+Salary);


    }

}
