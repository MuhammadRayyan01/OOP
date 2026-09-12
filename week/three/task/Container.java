package week.three.task;

public class Container {
    private int maxCapacity,beratMuatanSaatIni;
    private String ownerName, nomorResi;

    public Container(){
        this.nomorResi="00000";
        this.ownerName="no name";
        this.maxCapacity=1000;
    }
    public Container(String nomorResi, String ownerName,int maxCapacity,int beratMuatanSaatIni){
        this.nomorResi=nomorResi;
        this.ownerName=ownerName;
        this.maxCapacity=maxCapacity;
        this.beratMuatanSaatIni=0;
    }
    public void setName(String newName){
        ownerName = newName;
    }
    public String getName(){
        return ownerName;
    }
    public void setCap(int weight){
        if((weight)>maxCapacity){
            System.out.println("sorry the container capacity is beyond limitation");
        }else{
            beratMuatanSaatIni+=weight;
        }
    }
    public void decreaseWeight(int weight){
        if(weight<0){
            System.out.println("sorry, you dont decrease anything");
        }else{
            beratMuatanSaatIni-=weight;
        }
    }
    public int getCap(){
        return beratMuatanSaatIni;
    }
}
