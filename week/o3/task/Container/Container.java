package week.o3.task.Container;

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
        }else if(weight > (0.5*beratMuatanSaatIni)){
            System.out.println("Sorry, for safety reasons,a single cargo unloading operation cannot exceed 50% of the current load!");
        }else{
            beratMuatanSaatIni-=weight;
        }
    }
    public int getCap(){
        return beratMuatanSaatIni;
    }
}
/*If an operator attempts to unload cargo exceeding this
50% limit, the system must block the action and display a warning: "Sorry, for safety reasons,
a single cargo unloading operation cannot exceed 50% of the current load!".*/