/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceorm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author siriya_s
 */
public class InheritanceORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert employee
        FullTimeEmployee empA = new FullTimeEmployee();
        empA.setName("Alien");
        empA.setSalary(28000);
        PartTimeEmployee empB = new PartTimeEmployee();
        empB.setName("Manud");
        empB.setHoursWork(10);
        
        EmployeeManager.insertEmployee(empA);
        EmployeeManager.insertEmployee(empB);

        // update employee
        EmployeeManager.updatePartTimeName(Long.valueOf(2), "Captain");
        EmployeeManager.updatePartTimeHoursWork(Long.valueOf(2), 15);
        EmployeeManager.updateFullTimeSalary(Long.valueOf(1), 28900);

        // remove employee
        FullTimeEmployee empC = new FullTimeEmployee();
        empC.setName("Stormtrooper");
        empC.setSalary(25000);
        FullTimeEmployee empD = new FullTimeEmployee();
        empD.setName("Droid");
        empD.setSalary(29000);
        EmployeeManager.insertEmployee(empC);
        EmployeeManager.insertEmployee(empD);
        
        EmployeeManager.removeFullTimeEmployee(Long.valueOf(3));
    }   
}
