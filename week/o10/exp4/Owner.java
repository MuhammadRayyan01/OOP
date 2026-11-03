package week.o10.exp4;


public class Owner{
    public void pay(Payable p ){
        System.out.println("total payment: "+p.getPaymentAmount());
        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(""+eb.getBillInfo());
    }else if (p instanceof PermanentEmployee){
        PermanentEmployee pe = (PermanentEmployee) p;
        pe.getEmployeeInfo();
        System.out.println(""+pe.getEmployeeInfo());
    }
}
public void showMyEmployee(Employee e){
    System.out.println(""+e.getEmployeeInfo());
    if(e instanceof PermanentEmployee){
        System.out.println(" you have to pay her/him monthly");
    }
    else{
        System.out.println("no need to pay him/her");
    }
}
}