/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.sba23349;

/**
 *
 * @author anaclaudiaproenca
 */
//Extends the inheritance from Employee to the Manager
public class Manager extends Employee {
    private String username;
    private String password;
    
    public Manager(){
        username = "xxx";
        password = "xxx";
    }
    
    public Manager(String username, String password, String name, String email){
        
        //Call the constructor Employee that pass the parameter name and email.
        super(name, email);
        
        this.username = username;
        this.password = password;
    }

    //Get username
    public String getUsername() {
        return username;
    }

    //Set username
    public void setUsername(String username) {
        this.username = username;
    }

    //get password
    public String getPassword() {
        return password;
    }

    //set password
    public void setPassword(String password) {
        this.password = password;
    }
}