package quizandexam.quiz1;

public class AirConditioner {
    private String brand;
    private int productionYear;
    private Compressor mainCompressor;
    private Remote mainRemote;
    
    public AirConditioner(String brand,int productionYear,Compressor mainCompressor,Remote mainRemote){
        this.brand=brand;
        this.productionYear=productionYear;
        this.mainCompressor=mainCompressor;
        this.mainRemote=mainRemote;
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
   // Getter dan Setter untuk mainCompressor
    public void setMainCompressor(Compressor mainCompressor) {
        this.mainCompressor = mainCompressor;
    }
    public Compressor getMainCompressor() {
        return mainCompressor;
    }

    // Getter dan Setter untuk mainRemote
    public void setMainRemote(Remote mainRemote) {
        this.mainRemote = mainRemote;
    }
    public Remote getMainRemote() {
        return mainRemote;
    }
}

