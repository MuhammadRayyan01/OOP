package week.o6.Inheritance.exp2;

public class ClassB extends ClassA {
    protected int Z;

    public void getNilaiZ(){
        System.out.println("nilai z: "+Z);

    }
    public void setZ(int z){
        this.Z=z;
    }

    public void getJumlah(){
        System.out.println("jumlah:"+(X+Y+Z));
    }

    
}
