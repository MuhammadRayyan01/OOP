package o10.caseStudy;

public class InternshipEmployee extends Employee{
    private int Length;

    public InternshipEmployee(String name, int length){
        super(name);
        this.Length=length;
    }
    public void setLength(int length){
        this.Length= length;
    }
    public int getLength(){
        return Length;
    }
    public String getEmployeeInfo(){
    super.getEmployeeInfo();
    return Name;

    }
}
