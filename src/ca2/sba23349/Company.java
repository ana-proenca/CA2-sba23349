/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.sba23349;

import java.util.ArrayList;

/**
 *
 * @author anaclaudiaproenca
 */
public class Company {
    private String companyName;
    
    //to hold the list of employee objects
    private ArrayList<Employee> staff;
    
    //Default constructor that initialises the company name and the array list of employee
    public Company(){
        companyName = "Business Gnómes Ltd";
        staff = new ArrayList<>();
    }
    
    //Constructor that initialises the company name from the parameter
    public Company(String companyName){
        this.companyName = companyName;
        staff = new ArrayList<>();
    }
    
    //adds a new employee to the staff arrayList
    public void addNewStaff(Employee employee){
        staff.add(employee);
    }
    
    //returns the number of employees currently in the arrayList
    public int getStaffNumber(){
        return staff.size();
    }
    
    //Find and compare the employee number from the Array of Staff
    //Print the name when the employy number is greater than the value from the Parameter
    public void listEmployee(int empNumber){
        for(Employee emp : staff){
            if(emp.getEmployeeNumber() > empNumber){
                System.out.println(emp.getName());
            }
        }
    }
}
