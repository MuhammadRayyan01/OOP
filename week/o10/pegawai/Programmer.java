package o10.pegawai;

public class Programmer extends Pegawai {
private int Bonus;
public Programmer(String nama,int gaji, int bonus){
    super(nama,gaji);  
    }
@Override 
public int getGaji(){
    return Gaji;
}    
public int getBonus(){
    return Bonus;
}
}
