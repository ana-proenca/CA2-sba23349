package ca2.sba23349;

public class Employee {
    private String name;
    private String email;
    private int empNum;

    
    static int nextEmpNum = 1; //static field 
    
    
    public static int getNextEmpNum() {
        return nextEmpNum;
    }


    public Employee() {
        this.name = "name";
        this.email = "xxx@gmail.com";
        this.empNum = nextEmpNum++;
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }  

    public void setEmail(String email) {
        this.email = email;
    }
}
