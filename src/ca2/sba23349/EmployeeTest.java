/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2.sba23349;

import java.util.ArrayList;

/**
 *
 * @author anaclaudiaproenca
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee employee2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com");
        
        ArrayList<Employee> projectGroup = new ArrayList<>();
        projectGroup.add(employee1);
        projectGroup.add(employee2);
        projectGroup.add(employee3);
        
        System.out.println(Employee.nextEmpNum);
        
        int m = 2;
        
        for(Employee search : projectGroup) {
            int empNumber = search.getEmployeeNumber();
            
            if(empNumber > m){
                System.out.println(search.getName());
            }
        }
        
    }
}
