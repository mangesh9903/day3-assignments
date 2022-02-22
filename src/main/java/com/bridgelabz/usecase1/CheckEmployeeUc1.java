package com.bridgelabz.usecase1;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckEmployeeUc1 {
    final    int IS_FULL_TIME=1;
    private static final Logger LOG= LogManager.getLogger(CheckEmployeeUc1.class);
    public int checkEmployee() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
        {
            LOG.info("Employee  is Present.");
            return 1;
        }
        else {
           LOG.info("Employee is Abscent");
        }

          return 0;
    }

    public static void main(String[] args) {
        CheckEmployeeUc1 checkEmployee=new CheckEmployeeUc1();
        checkEmployee.checkEmployee();
    }



}
