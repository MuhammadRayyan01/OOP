package exp1;

public class Transaction {
    private String Type;
    private Double Amount;

    public Transaction (String type, Double amount){
        this.Type = type;
        this.Amount = amount;
    }
    public String getType(){
        return Type;
    }
    public Double getAmount(){
        return Amount;
    }
    @Override 
    public String toString(){
        return Type +" "+ Amount;
    }
    
}
