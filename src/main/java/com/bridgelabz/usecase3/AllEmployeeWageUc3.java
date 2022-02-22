package com.bridgelabz.usecase3;

public class AllEmployeeWageUc3 {
    final  int IS_FULL_TIME=2;
    final int IS_PART_TIME=1;
    final float EMP_RATE_PER_HOUR=20;
    float salary=0.0f;
    public float calEmpWage() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee  is Full Time.");
            int emphrs=8;
            salary=(EMP_RATE_PER_HOUR*emphrs);
            return salary;
        }
        else if (empCheck == IS_PART_TIME){

            System.out.println("Employee is Part Time");
            int emphrs=4;
            salary=(EMP_RATE_PER_HOUR*emphrs);
            return salary;
        }else
        {
            System.out.println("Employee is Abscent");
            return salary=0;
        }

    }


    public static void main(String[] args) {

        AllEmployeeWageUc3 allEmployeeWage=new AllEmployeeWageUc3();
       float EmployeeCheck;
        EmployeeCheck = allEmployeeWage.calEmpWage();
        System.out.println("Employee Salary: "+EmployeeCheck);
    }
}
