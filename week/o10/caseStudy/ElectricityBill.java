package o10.caseStudy;

public class ElectricityBill implements Payable {
    private int Kwh;
    private String Category;
    public int Bill;

    public ElectricityBill(int kwh, String category){
        this.Kwh=kwh;
        this.Category=category;
    }
    public void setKwh(int kwh){
        this.Kwh=kwh;
    }
    public void setCategory(String category){
        this.Category=category;
    }
    public int getKwh(){
        return Kwh;
    }
    public String getCategory(){
        return Category;
    }
    public int getBasePrice(){
        int bPrice =0;
        switch(Category){
            case "R-1" : bPrice = 100;
            break;
            case "R-2" : bPrice = 200;
            break;
        }
        return bPrice;
    }
    @Override 
    public int getPaymentAmount(){
        return  15;
    }

    public String getBillInfo(){
       return "kwh= "+Kwh+"\n"+ "Category= "+Category+" ("+getBasePrice()+" per Kwh)\n";
    }
}
