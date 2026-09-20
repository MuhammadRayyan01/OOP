package week.o2.assignment;

public class RentalShop {
    String id,memberName,gameName;
    int amountToPay;
    public void displayData(){
        System.out.println("\nrent data:");
        System.out.println("id: "+id);
        System.out.println("game name: "+gameName);
        System.out.println("member name: "+memberName);
        System.out.println("amount to pay: "+amountToPay);
    }
    public int payment(int price, int day){
        
        amountToPay = price * day;
        return amountToPay;
    }
    
}
