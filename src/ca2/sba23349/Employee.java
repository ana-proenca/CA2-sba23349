package ca2.sba23349;

public class Employee {
    private String name;
    private String email;
    private int empNum;

    
    static int nextEmpNum = 1; //static field 
    
    //Default constructor that initialize the default values
    public Employee() {
        this.name = "name";
        this.email = "xxx@gmail.com";
        this.empNum = nextEmpNum++;
    }
    
    //Constructor that initialize the variables from the parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    //Method to return the name
    public String getName() {
        return name;
    }

    //Method to return the email
    public String getEmail() {
        return email;
    }  
    
   //Method to return the employee number
    public int getEmployeeNumber() {
        return empNum;
    }
    
    //Method that returns the next employee number
    public static int getNextEmpNum() {
        return nextEmpNum;
    }

    //Set email when the lenght is greater than 3
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        }
    }
}
