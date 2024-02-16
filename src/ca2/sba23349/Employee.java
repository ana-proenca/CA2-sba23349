package ca2.sba23349;

public class Employee {
    private String name;
    private String email;
    private int empNum;

    public Employee() {
        name = "";
        email = "";
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
    
    
}
