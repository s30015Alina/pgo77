
public class Employee extends Person{
    double hiredate;
    String companyName;
    double salary;
    public Employee(String fname, String lname, double bday, double hireDate, String companyName, double salary) {
        super(fname, lname, bday);
        this.hiredate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }
    public double getJobSeniority(){
        return 2024 - hiredate;
    }
    public double getSalary(){
        return 2000;
    }
}
