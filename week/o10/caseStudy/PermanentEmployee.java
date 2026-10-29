package o10.caseStudy;

public class PermanentEmployee extends Employee implements Payable{
    private int Salary;

    public PermanentEmployee(String name, int salary){
        this.Name=name;
        this.Salary=salary;
    }
    @Override 
    public int getPaymentAmount(){
        return (int)(Salary+0.05*Salary);
    }

    @Override
    public String getEmployeeInfo() {
         String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent or employee for "+Salary+ "\n";
    return info;

    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }
    public int getSalary(){
        return Salary;
    }    
}
