package week.two.assignment;

public class testRental {
    public static void main(String[] args) {
        RentalShop rent1= new RentalShop();
        RentalShop rent2= new RentalShop();

        rent1.id="100";
        rent1.memberName="kiki";
        rent1.gameName="atha n the gang";
        rent1.payment(200000,2);
        rent1.displayData();
        rent2.id="101";
        rent2.memberName="koko";
        rent2.gameName="atha n the gang";
        rent2.gameName="gta 6";
        rent2.payment(1000000000,2);
        rent2.displayData();
        
    }
    
}
