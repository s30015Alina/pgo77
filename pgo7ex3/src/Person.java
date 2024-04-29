
abstract class Person {
    String fname;
    String lname;
    double bday;

    public Person(String fname, String lname,double bday ){
        this.fname = fname;
        this.lname = lname;
        this.bday = bday;
    }
    public double getAge(){
        return 2024 - bday ;
    }
}
