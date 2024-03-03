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

    //Uses the regex to validate the input of the email
    public boolean HasValidEmail() {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        return email.matches(emailRegex);
    }

    //Bonus challenge
    //I created an override method that will return the emp number as Hashcode
    @Override
    public int hashCode() {
        return this.empNum;
    }

    //This method override the equals that will check whether there is already an empnumber that has been added to the Hashset
    //If true, it does not add the same element to the hashset
    //if false, it does.
    @Override
    public boolean equals(Object obj) {
        Employee e = null;
        if (obj instanceof Employee) {
            e = (Employee) obj;
        }
        if (this.empNum == e.empNum) {
            return true;
        } else {
            return false;
        }
    }
}
