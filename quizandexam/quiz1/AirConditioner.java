package quizandexam.quiz1;

public class AirConditioner {
    private String brand;
    private int productionYear;
    private Compressor mainCompressor;
    private Remote mainRemote;
    
    public AirConditioner(String brand,int productionYear,Compressor mainCompressor,Remote rmt){
        this.brand=brand;
        this.productionYear=productionYear;
        this.mainCompressor=mainCompressor;
        this.mainRemote=rmt;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setProductionYear(int date){
        this.productionYear=date;
    }
    public int getProductionYear(){
        return productionYear;
    }
    public void getMainComponent(){
        
    }
}
