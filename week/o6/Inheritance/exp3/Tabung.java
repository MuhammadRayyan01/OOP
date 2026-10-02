package week.o6.Inheritance.exp3;

public class Tabung extends Bangun {
    protected int t;
    public void setSuperPhi(double phi){
        super.Phi=phi;
    }
    public void setSuperR(int r){
        super.R=r;
    }
    public void setT(int t){
        this.t=t;
    }
    public void volume(){
        System.out.println("volume tabung adalah:"+(super.Phi*super.R*super.R*this.t));
    }
    
}
