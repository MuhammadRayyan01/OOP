package week.one.assignment.Bottle;

public class Bottle {
    private String materialType;
    //bottle volume in Liter (1,2,3,4,...)
    private int bottleVolume; 
    //is the bottle closed or opened?
    boolean bottleCap;
    
    public void setMaterialType(String material){
    materialType = material;
    }
    public void setBottleVolume(int volume){
    bottleVolume = volume;
    }
    public boolean setBottleCap(boolean Cap){
        bottleCap=Cap;
        return bottleCap;
    }
    public void printInfo(){
        System.out.println("bottle data");
        System.out.println("material type: "+ materialType);
        System.out.println("bottle volume: "+ bottleVolume);
        System.out.println("is the bottle cap closed or opened?: "+bottleCap);
    }

}
