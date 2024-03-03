/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2.sba23349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author anaclaudiaproenca https://github.com/ana-proenca/CA2-sba23349
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create the manager object that pass the username, password, name and email that are from the employee class.
        Manager employee1 = new Manager("Gnomeo", "smurf", "Joe Bloggs", "jb@gmail.com");

        Employee employee2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com");

        ArrayList<Employee> projectGroup = new ArrayList<>();
        projectGroup.add(employee1); //Add the manager as list of employee
        projectGroup.add(employee2);
        projectGroup.add(employee3);

        System.out.println(Employee.nextEmpNum);

        int m = 1;

//            for (Employee search : projectGroup) {
//                int empNumber = search.getEmployeeNumber();
//
//                if (empNumber > m) {
//                    System.out.println(search.getName());
//                }
//            }
        Company company = new Company();

        //Load the current staffs to the company class
        company.addNewStaff(employee1);
        company.addNewStaff(employee2);
        company.addNewStaff(employee3);
        
        company.addNewStaff(employee3);
        company.addNewStaff(employee3);
        company.addNewStaff(employee3);

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Inform your username");
            String username = sc.next();

            System.out.println("Inform your password");
            String password = sc.next();

            //MENU
            //Check whether the username is valid or not
            if (!employee1.getUsername().equals(username)) {
                System.out.println("Invalid username");
            }

            //Check whether the password is valid or not
            if (!employee1.getPassword().equals(password)) {
                System.out.println("Invalid password");
            }

            boolean userlogged = true;

            while (userlogged) {
                System.out.println("\n");
                System.out.println("1 - list employees");
                System.out.println("2 - add new employee");
                System.out.println("3 - remove employee");
                System.out.println("4 - logoff");

                int options = Integer.parseInt(sc.next());

                switch (options) {
                    case 1:
                        company.listEmployee(m);
                        break;
                    case 2:
                        System.out.println("Inform the employee name");
                        String employeeName = sc.next();

                        System.out.println("Inform the employee email");
                        String employeeEmail = sc.next();

                        Employee newEmployee = new Employee(employeeName, employeeEmail);
                        company.addNewStaff(newEmployee);
                        break;
                    case 3:
                        System.out.println("Inform the employee number");
                        int empNum = Integer.parseInt(sc.next());
                        company.removeStaff(empNum);
                        break;
                    case 4:
                        userlogged = false;
                        break;
                    default:
                        throw new AssertionError();
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
