public class Manager extends Employee{
    double bonus;
    public Manager(String fname, String lname, double bday, double hireDate, String companyName, double salary, double bonus) {
        super(fname, lname, bday, hireDate, companyName, salary);
        this.bonus = bonus;
    }
    public double getSalary(){
        return salary + bonus;
    }
    public String toString(){
        return "Manager with lastname " + lname + " and age " + getAge() + " has salary " + getSalary();
    }
}
