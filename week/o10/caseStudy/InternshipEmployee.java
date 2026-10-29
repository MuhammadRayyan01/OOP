package o10.caseStudy;

public class InternshipEmployee extends Employee{
    private int Length;

    public InternshipEmployee(String name, int length){
        this.Name=name;
        this.Length=length;
    }
    public void setLength(int length){
        this.Length= length;
    }
    public int getLength(){
        return Length;
    }
    @Override 
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship for employee for "+Length+ " month/s\n";
    return info;

    }
}
