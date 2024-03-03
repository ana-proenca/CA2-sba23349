/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.sba23349;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author anaclaudiaproenca
 */
public class Company {

    private String companyName;

    //to hold the list of employee objects
    private ArrayList<Employee> staff;
    private HashSet<Employee> staffSet;

    //Default constructor that initialises the company name and the array list of employee
    public Company() {
        companyName = "Business Gnómes Ltd";
        staff = new ArrayList<>();
        staffSet = new HashSet<>();
    }

    //Constructor that initialises the company name from the parameter
    public Company(String companyName) {
        this.companyName = companyName;
        staff = new ArrayList<>();
        staffSet = new HashSet<>();
    }

    //adds a new employee to the staff arrayList
    public void addNewStaff(Employee employee) {
        //Only add the employee to the staff if the email is valid
        if (employee.HasValidEmail()) {
            staff.add(employee);
            staffSet.add(employee);
        } else { //prints the information to the manager if the email is invalid
            System.out.println("Email format is invalid");
        }
    }

    //method that removes staff
    public void removeStaff(int empNum) {
        staff.removeIf(employee -> employee.getEmployeeNumber() == empNum);
    }

    //returns the number of employees currently in the arrayList
    public int getStaffNumber() {
        return staff.size();
    }

    //Find and compare the employee number from the Array of Staff
    //Print the name when the employy number is greater than the value from the Parameter
    public void listEmployee(int empNumber) {
   System.out.println("\n Array List");

        for (Employee emp : staff) {
            if (emp.getEmployeeNumber() > empNumber) {
                System.out.println("Name: " + emp.getName() + ", Number: " + emp.getEmployeeNumber());
            }
        }
        
           System.out.println("\n Hashset");
        for (Employee emp : staffSet) {
            if (emp.getEmployeeNumber() > empNumber) {
                System.out.println("Name: " + emp.getName() + ", Number: " + emp.getEmployeeNumber());
            }
        }
    }
}
