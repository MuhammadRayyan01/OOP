package week.one.assignment.Motorcycle;

public class Motorcycle extends Bike{
  private String MachineType;
  public void setMachineType(String Machine){
    MachineType = Machine;
  }
  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Machine Type: "+ MachineType);
    System.out.println("Bike Development: Motorcycle");
  }

  


}
